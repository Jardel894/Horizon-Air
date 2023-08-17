package br.com.horizonair.service.impl;

import br.com.horizonair.converter.PrecoClasseConverter;
import br.com.horizonair.converter.VooConverter;
import br.com.horizonair.dto.PrecoClasseDto;
import br.com.horizonair.dto.VooDto;
import br.com.horizonair.dto.VooDtoFilter;
import br.com.horizonair.dto.VooDtoUpdateRequest;
import br.com.horizonair.entites.Aeroporto;
import br.com.horizonair.entites.PrecoClasse;
import br.com.horizonair.entites.Voo;
import br.com.horizonair.repository.AeroportoRepository;
import br.com.horizonair.repository.PrecoClasseRepository;
import br.com.horizonair.repository.VooRepository;
import br.com.horizonair.service.VooService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VooSeviceImpl  implements VooService {

    private final VooRepository vooRepository;
    private final PrecoClasseRepository precoClasseRepository;
    private final AeroportoRepository aeroportoRepository;
    private final ModelMapper modelMapper;


    @Override
    @Transactional
    public void criar(VooDto vooDto) {
        Voo voo = VooConverter.toVoo(vooDto);
        setAeroporto(vooDto, voo);
        List<PrecoClasseDto> precoClasseDto = vooDto.getPrecoClasse();
        List<PrecoClasse> precoClasseList = precoClasseDto.stream().map(PrecoClasseConverter::toPrecoClasse).toList();
        Voo vooSalvo = vooRepository.save(voo);
        precoClasseList.forEach(precoClasse -> precoClasse.setVoo(vooSalvo));
        precoClasseRepository.saveAll(precoClasseList);
    }

    public List<Voo> buscarVoo(VooDtoFilter vooDtoFilter) throws RuntimeException{
        Example<Voo> example = getVooExample(vooDtoFilter);

        return vooRepository.findAll(example);

    }

    @Override
    public void atualizarVoo(Long codigoVooRequest, VooDtoUpdateRequest vooDtoUpdateRequest) {
        Voo vooBaseDado = vooRepository.findById(codigoVooRequest).orElseThrow(RuntimeException::new);
        modelMapper.map(vooDtoUpdateRequest, vooBaseDado);
        setUpdateAeroporto(vooDtoUpdateRequest, vooBaseDado);
        vooRepository.save(vooBaseDado);

    }

    @Override
    public Voo getVoo(Long vooId) {
        return vooRepository.findById(vooId)
                .orElseThrow( () -> new  RuntimeException("Voo não encontrado"));
    }

    private void setUpdateAeroporto(VooDtoUpdateRequest vooDtoUpdateRequest, Voo voo) {

        if(!ObjectUtils.isEmpty(vooDtoUpdateRequest) && !ObjectUtils.isEmpty(vooDtoUpdateRequest.getOrigem())) {
            Optional<Aeroporto> origemOptional = aeroportoRepository.findByIata(vooDtoUpdateRequest.getOrigem().getIata());
            if (origemOptional.isPresent()) voo.setOrigem(origemOptional.get());
            voo.getOrigem().setCidadeId(vooDtoUpdateRequest.getOrigem().getCidadeSigla());

        }


        if(!ObjectUtils.isEmpty(vooDtoUpdateRequest) && !ObjectUtils.isEmpty(vooDtoUpdateRequest.getDestino())) {
            Optional<Aeroporto> destinoOptional = aeroportoRepository.findByIata(vooDtoUpdateRequest.getDestino().getIata());
            if (destinoOptional.isPresent()) voo.setDestino(destinoOptional.get());
            voo.getDestino().setCidadeId(vooDtoUpdateRequest.getDestino().getCidadeSigla());
        }

    }


    private void setAeroporto(VooDto vooDto, Voo voo) {
        Optional<Aeroporto> origemOptional = aeroportoRepository.findByIata(vooDto.getOrigem().getIata());
        Optional<Aeroporto> destinoOptional = aeroportoRepository.findByIata(vooDto.getDestino().getIata());
        if (origemOptional.isPresent()) voo.setOrigem(origemOptional.get());
        if (destinoOptional.isPresent()) voo.setDestino(destinoOptional.get());
    }

    private static Example<Voo> getVooExample(VooDtoFilter vooDtoFilter) {
        Aeroporto origem = Aeroporto.builder()
                .cidade(vooDtoFilter.getOrigem())
                .build();
        Aeroporto destino = Aeroporto.builder()
                .cidade(vooDtoFilter.getDestino())
                .build();

        Voo voo = Voo.builder()
                .origem(origem)
                .destino(destino)
                .dataPartida(vooDtoFilter.getDataPartida())
                .build();

        ExampleMatcher matcher = ExampleMatcher.matching()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING)
                .withIgnoreCase()
                .withIgnoreNullValues();

        return Example.of(voo, matcher);
    }

}
