package br.com.horizonair.entites;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Voo {


    @Id
    @Column(name = "CODIGO_VOO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoVoo;

    @JoinColumn(name = "ORIGEM_ID")
    @OneToOne(cascade = CascadeType.ALL)
    private Aeroporto origem;

    @JoinColumn(name = "DESTINO_ID")
    @OneToOne(cascade = CascadeType.ALL)
    private Aeroporto destino;

    @Column(name = "DATA_PARTIDA")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataPartida;

    @Column(name = "HORA_PARTIDA")
    @JsonFormat(pattern="HH:mm:ss")
    private LocalTime horaPartida;

    @Column(name = "PRECO_CLASSE")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "voo")
    private List<PrecoClasse> precoClasse;

    @Column(nullable = false, columnDefinition = "boolean default true")
    private boolean ativo;
}
