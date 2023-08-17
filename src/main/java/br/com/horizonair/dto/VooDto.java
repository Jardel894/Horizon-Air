package br.com.horizonair.dto;

import br.com.horizonair.entites.PrecoClasse;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
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
