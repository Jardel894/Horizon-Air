package br.com.horizonair.repository;

import br.com.horizonair.entites.Passagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassagemRepository  extends JpaRepository<Passagem, Long> {
}
