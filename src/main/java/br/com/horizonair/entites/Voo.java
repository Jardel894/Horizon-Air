package br.com.horizonair.entites;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;


@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Voo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID codigoVoo;

    @OneToOne(cascade = CascadeType.ALL)
    private Aeroporto origem;

    @OneToOne(cascade = CascadeType.ALL)
    private Aeroporto destino;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataPartida;

    @JsonFormat(pattern="HH:mm:ss")
    private LocalTime horaPartida;
}
