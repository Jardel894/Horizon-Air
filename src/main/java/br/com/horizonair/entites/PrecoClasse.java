package br.com.horizonair.entites;

import br.com.horizonair.enums.EnumPrecoClasse;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;


@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PrecoClasse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Voo voo;

    @Enumerated(EnumType.STRING)
    private EnumPrecoClasse nome;

    private Integer quantidadeAssento;

    private Integer disponibilidade;

    private BigDecimal valorClasse;
}
