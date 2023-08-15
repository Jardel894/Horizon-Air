package br.com.horizonair.repository;

import br.com.horizonair.entites.Aeroporto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AeroportoRepository extends JpaRepository<Aeroporto, UUID> {

}
