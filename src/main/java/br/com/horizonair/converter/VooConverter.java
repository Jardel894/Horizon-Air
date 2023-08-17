package br.com.horizonair.converter;

import br.com.horizonair.dto.VooDto;
import br.com.horizonair.entites.Voo;


public class VooConverter {
    public static Voo toVoo (VooDto vooDto){
        return Voo.builder()
                .origem(AeroportoConverter.toAeroporto(vooDto.getOrigem()))
                .destino(AeroportoConverter.toAeroporto(vooDto.getDestino()))
                .dataPartida(vooDto.getDataPartida())
                .horaPartida(vooDto.getHoraPartida())
                .precoClasse(PrecoClasseConverter.toPrecoClasseList(vooDto.getPrecoClasse()))
                .build();
    }

    public static VooDto ToVooDto(Voo voo){

        return VooDto.builder()

                .origem(AeroportoConverter.toAeroportoDto(voo.getOrigem()))
                .destino(AeroportoConverter.toAeroportoDto(voo.getDestino()))
                .dataPartida(voo.getDataPartida())
                .horaPartida(voo.getHoraPartida())
                .precoClasse(PrecoClasseConverter.toPrecoClasseDtoList(voo.getPrecoClasse()))
                .build();
    }
}
