package br.com.horizonair.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AeroportoDtoUpdateRequest {

    private String iata;


    private String cidadeSigla;


    private String cidade;


    private String uf;


    private String paisSigla;


    private String pais;

}
