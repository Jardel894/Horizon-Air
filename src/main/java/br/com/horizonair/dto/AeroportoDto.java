package br.com.horizonair.dto;

import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AeroportoDto {

    @NotNull
    private String iata;

    @NotNull
    private String cidadeSigla;

    @NotNull
    private String cidade;

    @NotNull
    private String uf;

    @NotNull
    private String paisSigla;

    @NotNull
    private String pais;

}
