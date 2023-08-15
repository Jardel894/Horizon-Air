package br.com.horizonair.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalTime;
import java.util.Date;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VooDto {

    @NotNull
    private AeroportoDto origem;
    @NotNull
    private AeroportoDto destino;
    @NotNull
    private Date dataPartida;
    @NotNull
    private LocalTime horaPartida;
    @NotNull
    private Integer quatidadeAssento;
}
