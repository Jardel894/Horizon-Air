package br.com.horizonair.service.impl;

import br.com.horizonair.dto.PessoaDto;
import br.com.horizonair.entites.Pessoa;
import br.com.horizonair.repository.PessoaRepository;
import br.com.horizonair.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository pessoaRepository;


    public Optional<Pessoa> buscarPessoaPorCpf(String cpf){
        return pessoaRepository.findByCpf(cpf);
    }

    @Override
    public Pessoa save(Pessoa map) {
        return pessoaRepository.save(map);
    }
}
