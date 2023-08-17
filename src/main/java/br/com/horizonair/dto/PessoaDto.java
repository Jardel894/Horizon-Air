package br.com.horizonair.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDto {


    private String nome;

    private String cpf;

    private String email;
}
