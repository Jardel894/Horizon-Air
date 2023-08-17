package br.com.horizonair.dto;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VooDtoFilter {

    private String origem;

    private String destino;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate dataPartida;



}
