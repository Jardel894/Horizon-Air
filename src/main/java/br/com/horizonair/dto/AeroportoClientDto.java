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
    public String iata;

    @JsonProperty("CityId")
    public String cidadeId;

    @JsonProperty("CityName")
    public String cidade;

    @JsonProperty("CountryId")
    public String paisSigla;

    @JsonProperty("CountryName")
    public String pais;
}
