package br.com.horizonair.service;

import br.com.horizonair.dto.VooDto;
import br.com.horizonair.dto.VooDtoFilter;
import br.com.horizonair.dto.VooDtoUpdateRequest;
import br.com.horizonair.entites.Voo;

import java.util.List;

public interface VooService {


    void criar(VooDto vooDto);

    List<Voo> buscarVoo(VooDtoFilter vooDtoFilter);

    void atualizarVoo(Long codigoVoo, VooDtoUpdateRequest vooDtoUpdateRequest);

    Voo getVoo(Long vooId);

    void cancelarVoo(Long codigoVoo);
}
