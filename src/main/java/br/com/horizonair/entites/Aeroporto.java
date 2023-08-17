package br.com.horizonair.entites;


import lombok.*;

import javax.persistence.*;

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

    private String cidadeId;

    private String uf;

    private String paisSigla;

    private String pais;
}
