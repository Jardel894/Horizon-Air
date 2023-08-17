package br.com.horizonair.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AeroportoDto {

    @NotNull
    private String iata;

    @NotNull
    private String cidadeId;

    @NotNull
    private String cidade;

    @NotNull
    private String uf;

    @NotNull
    private String paisSigla;

    @NotNull
    private String pais;

}
