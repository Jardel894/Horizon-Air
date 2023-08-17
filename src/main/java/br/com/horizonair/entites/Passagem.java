package br.com.horizonair.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
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
