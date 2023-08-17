package br.com.horizonair.service.impl;

import br.com.horizonair.dto.PassagemDtoRequest;
import br.com.horizonair.dto.PassagemDtoResponse;
import br.com.horizonair.dto.PessoaDto;
import br.com.horizonair.entites.Passagem;
import br.com.horizonair.entites.Pessoa;
import br.com.horizonair.entites.PrecoClasse;
import br.com.horizonair.entites.Voo;
import br.com.horizonair.enums.EnumPrecoClasse;
import br.com.horizonair.repository.PassagemRepository;
import br.com.horizonair.service.PassagemService;
import br.com.horizonair.service.PessoaService;
import br.com.horizonair.service.VooService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PassagemServiceImpl implements PassagemService {

    private final VooService vooService;
    private final PessoaService pessoaService;
    private final ModelMapper modelMapper;
    private final PassagemRepository passagemRepository;


    @Override
    @Transactional
    public PassagemDtoResponse comprarPassagem(Long vooId, EnumPrecoClasse enumPrecoClasse, PassagemDtoRequest passagemDtoRequest) {
        Voo voo = vooService.getVoo(vooId);
        Optional<Pessoa> compradorOptional = pessoaService.buscarPessoaPorCpf(passagemDtoRequest.getComprador().getCpf());
        Optional<Pessoa> passageiroOptional = pessoaService.buscarPessoaPorCpf(passagemDtoRequest.getPassageiro().getCpf());
        Pessoa comprador = getPessoa(passagemDtoRequest.getComprador(), compradorOptional);
        Pessoa passageiro = getPessoa(passagemDtoRequest.getPassageiro(), passageiroOptional);
        PrecoClasse precoClasse = getClasse(enumPrecoClasse, voo);
        Passagem passagem = Passagem.builder()
                .voo(voo)
                .ativo(Boolean.TRUE)
                .bagagem(passagemDtoRequest.isBagagem())
                .classe(precoClasse)
                .comprador(comprador)
                .passageiro(passageiro)
                .precoTotalPassagem(precoClasse.getValorClasse())
                .build();
        passagemRepository.save(passagem);
        return PassagemDtoResponse.builder()
                .precoTotalPassagem(passagem.getPrecoTotalPassagem())
                .build();
    }

    private Pessoa getPessoa(PessoaDto pessoaDto, Optional<Pessoa> pessoaOptional) {
        if(pessoaOptional.isPresent()){
            return pessoaOptional.get();
        }
           return pessoaService.save(modelMapper.map(pessoaDto, Pessoa.class));
    }

    private static PrecoClasse getClasse(EnumPrecoClasse enumPrecoClasse, Voo voo) {
        Optional<PrecoClasse> precoEncontrado = voo.getPrecoClasse()
                .stream()
                .filter(p -> enumPrecoClasse.equals(p.getNome()))
                .findFirst();

        PrecoClasse precoClasse = precoEncontrado.orElseThrow(() -> new RuntimeException("Preco não encontrado"));
        return precoClasse;
    }
}
