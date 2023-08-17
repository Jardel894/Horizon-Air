package br.com.horizonair.repository;

import br.com.horizonair.entites.Voo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface VooRepository extends JpaRepository<Voo, Long> {

    @Query(value = "SELECT v.DATA_PARTIDA, v.HORA_PARTIDA, a.CIDADE, a.IATA, c.VALOR_CLASSE " +
            "FROM VOO v " +
            "INNER JOIN AEROPORTO a ON a.ID = v.ORIGEM_ID " +
            "INNER JOIN AEROPORTO ae ON ae.ID = v.DESTINO_ID " +
            "INNER JOIN PRECO_CLASSE c ON c.VOO_CODIGO_VOO = v.CODIGO_VOO " +
            "WHERE v.ORIGEM_ID = :idOrigem " +
            "AND v.DESTINO_ID = :idDestino", nativeQuery = true)
    List<Voo> buscarVoo(Long idOrigem, Long idDestino);



}
