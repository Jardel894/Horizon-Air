package br.com.horizonair.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VooDtoUpdateRequest {

    private AeroportoDtoUpdateRequest origem;

    private AeroportoDtoUpdateRequest destino;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataPartida;

    private LocalTime horaPartida;

    private List<PrecoClasseDto> precoClasse;
}
