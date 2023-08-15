package br.com.horizonair.repository;

import br.com.horizonair.entites.Voo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VooRepository extends JpaRepository<Voo, UUID> {
}
