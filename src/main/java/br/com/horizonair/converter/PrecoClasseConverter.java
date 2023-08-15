package br.com.horizonair.converter;


import br.com.horizonair.dto.PrecoClasseDto;
import br.com.horizonair.entites.PrecoClasse;
import br.com.horizonair.entites.Voo;

import java.math.BigDecimal;

public class PrecoClasseConverter {


    public static PrecoClasse toPrecoClasse(PrecoClasseDto precoClasseDto) {

        return PrecoClasse.builder()
                .voo(precoClasseDto.getVoo())
                .nome(precoClasseDto.getNome())
                .quantidadeAssento(precoClasseDto.getQuantidadeAssento())
                .disponibilidade(precoClasseDto.getDisponibilidade())
                .valorClasse(precoClasseDto.getValorClasse())
                .build();
    }

    public static PrecoClasseDto toPrecoClasseDto(PrecoClasse precoClasse) {

        return PrecoClasseDto.builder()
                .voo(precoClasse.getVoo())
                .nome(precoClasse.getNome())
                .quantidadeAssento(precoClasse.getQuantidadeAssento())
                .disponibilidade(precoClasse.getDisponibilidade())
                .valorClasse(precoClasse.getValorClasse())
                .build();
    }

}
