package br.com.horizonair.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassagemDtoResponse {


    private Long id;

    private String origem;

    private String destino;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataPartida;

    @JsonFormat(pattern="HH:mm:ss")
    private LocalTime horaPartida;

    private PessoaDto passageiro;

    private BigDecimal precoTotalPassagem;


}
