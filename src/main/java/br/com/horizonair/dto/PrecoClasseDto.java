package br.com.horizonair.dto;

import br.com.horizonair.entites.Voo;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrecoClasseDto {



    private UUID uuid;

    private Voo voo;

    private String nome;

    private Integer quantidadeAssento;

    private Integer disponibilidade;

    private BigDecimal valorClasse;
}
