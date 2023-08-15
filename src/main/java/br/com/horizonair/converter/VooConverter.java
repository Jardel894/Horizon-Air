package br.com.horizonair.converter;

import br.com.horizonair.dto.VooDto;
import br.com.horizonair.entites.Voo;


public class VooConverter {



    public static Voo toVoo (VooDto vooDto){
        return Voo.builder()
                .origem(AeroportoConverte.toAeroporto(vooDto.getOrigem()))
                .destino(AeroportoConverte.toAeroporto(vooDto.getDestino()))
                .dataPartida(vooDto.getDataPartida())
                .horaPartida(vooDto.getHoraPartida())
                .build();
    }

    public static VooDto ToVooDto(Voo voo){

        return VooDto.builder()
                .origem(AeroportoConverte.toAeroportoDto(voo.getOrigem()))
                .destino(AeroportoConverte.toAeroportoDto(voo.getDestino()))
                .dataPartida(voo.getDataPartida())
                .horaPartida(voo.getHoraPartida())
                .build();
    }
}
