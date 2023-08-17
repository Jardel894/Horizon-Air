package br.com.horizonair.converter;


import br.com.horizonair.dto.PrecoClasseDto;
import br.com.horizonair.entites.PrecoClasse;

import java.util.List;

public class PrecoClasseConverter {
    public static PrecoClasse toPrecoClasse(PrecoClasseDto precoClasseDto) {

        return PrecoClasse.builder()
                .nome(precoClasseDto.getNome())
                .quantidadeAssento(precoClasseDto.getQuantidadeAssento())
                .disponibilidade(precoClasseDto.getDisponibilidade())
                .valorClasse(precoClasseDto.getValorClasse())
                .build();
    }

    public static PrecoClasseDto toPrecoClasseDto(PrecoClasse precoClasse) {

        return PrecoClasseDto.builder()
                .nome(precoClasse.getNome())
                .quantidadeAssento(precoClasse.getQuantidadeAssento())
                .disponibilidade(precoClasse.getDisponibilidade())
                .valorClasse(precoClasse.getValorClasse())
                .build();
    }

    public static List<PrecoClasse> toPrecoClasseList(List<PrecoClasseDto> precoClasseDto){
        return precoClasseDto.stream()
                .map(PrecoClasseConverter::toPrecoClasse).toList();
    }

    public static List<PrecoClasseDto> toPrecoClasseDtoList(List<PrecoClasse> precoClasse){
        return precoClasse.stream()
                .map(PrecoClasseConverter::toPrecoClasseDto).toList();
    }


}
