package br.com.horizonair.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassagemDtoResponse {


    private BigDecimal precoTotalPassagem;


}
