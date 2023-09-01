package br.com.horizonair.entites;


import br.com.horizonair.enums.EnumPrecoClasse;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

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
    @JsonBackReference
    private Voo voo;

    @Enumerated(EnumType.STRING)
    private EnumPrecoClasse nome;

    private Integer quantidadeAssento;

    private Integer disponibilidade;

    private BigDecimal valorClasse;
}
