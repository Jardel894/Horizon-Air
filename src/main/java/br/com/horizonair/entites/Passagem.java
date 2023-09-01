package br.com.horizonair.entites;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Passagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Voo voo;

    @OneToOne
    private PrecoClasse classe;

    @OneToOne
    private Pessoa passageiro;

    @OneToOne
    private Pessoa comprador;

    private boolean bagagem;

    private BigDecimal precoTotalPassagem;

    private boolean ativo;

}
