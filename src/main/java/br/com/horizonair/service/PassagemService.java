package br.com.horizonair.service;

import br.com.horizonair.dto.PassagemDtoRequest;
import br.com.horizonair.dto.PassagemDtoResponse;
import br.com.horizonair.enums.EnumPrecoClasse;
import org.springframework.web.bind.annotation.PathVariable;

public interface PassagemService {


    PassagemDtoResponse comprarPassagem(Long vooId, EnumPrecoClasse enumPrecoClasse, PassagemDtoRequest passagemDtoRequest);
}
