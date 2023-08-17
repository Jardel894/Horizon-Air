package br.com.horizonair.dto;

import br.com.horizonair.entites.Voo;
import br.com.horizonair.enums.EnumPrecoClasse;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.util.UUID;

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
