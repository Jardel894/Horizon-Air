package br.com.horizonair.dto;

import br.com.horizonair.enums.EnumPrecoClasse;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;


import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrecoClasseDto {

    private Long id;

    private VooDto voo;

    @Enumerated(EnumType.STRING)
    private EnumPrecoClasse nome;

    private Integer quantidadeAssento;

    private Integer disponibilidade;

    private BigDecimal valorClasse;
}
