package br.com.horizonair.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AeroportoClientDto {

    @JsonProperty("PlaceId")
    private String iata;

    @JsonProperty("CityId")
    private String cidadeId;

    @JsonProperty("CityName")
    private String cidade;

    @JsonProperty("CountryId")
    private String paisSigla;

    @JsonProperty("CountryName")
    private String pais;
}
