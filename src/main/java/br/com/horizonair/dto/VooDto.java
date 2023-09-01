package br.com.horizonair.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


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
    @JsonFormat()
    private LocalDate dataPartida;
    @NotNull
    private LocalTime horaPartida;
    @NotNull
    private List<PrecoClasseDto> precoClasse;

}
