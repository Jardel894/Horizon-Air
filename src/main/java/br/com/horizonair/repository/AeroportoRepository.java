package br.com.horizonair.repository;

import br.com.horizonair.entites.Aeroporto;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface AeroportoRepository extends JpaRepository<Aeroporto, Long> {

    Optional<Aeroporto> findByCidade(String cidade);


    Optional<Aeroporto> findByIata(String iata);
}
