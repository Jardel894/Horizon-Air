package br.com.horizonair.converter;

import br.com.horizonair.dto.AeroportoDto;
import br.com.horizonair.entites.Aeroporto;

public class AeroportoConverter {
    public static Aeroporto toAeroporto(AeroportoDto aeroportoDto) {

        return Aeroporto.builder()
                .iata(aeroportoDto.getIata())
                .cidadeId(aeroportoDto.getCidadeId())
                .cidade(aeroportoDto.getCidade())
                .paisSigla(aeroportoDto.getPaisSigla())
                .uf(aeroportoDto.getUf())
                .pais(aeroportoDto.getPais())
                .build();
    }

    public static AeroportoDto toAeroportoDto(Aeroporto aeroporto) {

        return AeroportoDto.builder()
                .iata(aeroporto.getIata())
                .cidadeId(aeroporto.getCidadeId())
                .cidade(aeroporto.getCidade())
                .paisSigla(aeroporto.getPaisSigla())
                .uf(aeroporto.getUf())
                .pais(aeroporto.getPais())
                .build();
    }
}
