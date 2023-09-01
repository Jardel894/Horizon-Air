package br.com.horizonair.entites;


import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Aeroporto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String iata;

    private String cidade;

    private String cidadeSigla;

    private String uf;

    private String paisSigla;

    private String pais;
}
