package br.com.horizonair.repository;

import br.com.horizonair.entites.PrecoClasse;
import br.com.horizonair.entites.Voo;
import br.com.horizonair.enums.EnumPrecoClasse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PrecoClasseRepository extends JpaRepository <PrecoClasse, Long> {

    PrecoClasse findByVooAndNome(Voo voo, EnumPrecoClasse enumPrecoClasse);
}
