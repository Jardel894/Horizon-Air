package br.com.horizonair.dto;

import br.com.horizonair.entites.Aeroporto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AeroportoDto {


    @NotNull
    public String iata;

    @NotNull
    public String cidadeId;

    @NotNull
    public String cidade;

    @NotNull
    public String uf;

    @NotNull
    public String paisSigla;

    @NotNull
    public String pais;

}
