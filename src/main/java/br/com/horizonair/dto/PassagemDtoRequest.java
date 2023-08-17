package br.com.horizonair.dto;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassagemDtoRequest {


    private PessoaDto passageiro;


    private PessoaDto comprador;

    private boolean bagagem;
}
