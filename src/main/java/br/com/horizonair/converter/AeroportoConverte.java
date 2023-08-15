package br.com.horizonair.converter;

import br.com.horizonair.dto.AeroportoDto;
import br.com.horizonair.entites.Aeroporto;

public class AeroportoConverte {


    public static Aeroporto toAeroporto(AeroportoDto aeroportoDto) {

      return   Aeroporto.builder()
                .iata(aeroportoDto.iata)
                .cidadeId(aeroportoDto.cidadeId)
                .cidade(aeroportoDto.cidade)
                .paisSigla(aeroportoDto.paisSigla)
                .pais(aeroportoDto.pais)
                .build();
    }

    public static AeroportoDto toAeroportoDto(Aeroporto aeroporto) {

        return   AeroportoDto.builder()
                .iata(aeroporto.iata)
                .cidadeId(aeroporto.cidadeId)
                .cidade(aeroporto.cidade)
                .paisSigla(aeroporto.paisSigla)
                .pais(aeroporto.pais)
                .build();
    }
}
