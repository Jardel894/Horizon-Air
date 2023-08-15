package br.com.horizonair.service;


import br.com.horizonair.dto.AeroportoClientDto;
import br.com.horizonair.dto.AeroportoDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AeroportoSevice {

    List<AeroportoClientDto> getAeroporto(String cidade);
}
