package br.com.horizonair.service.impl;

import br.com.horizonair.client.AeroportoClient;
import br.com.horizonair.dto.AeroportoClientDto;
import br.com.horizonair.dto.AeroportoDto;
import br.com.horizonair.service.AeroportoSevice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AeroportoServiceImpl implements AeroportoSevice {


    private final AeroportoClient aeroportoClient;
    public List<AeroportoClientDto> getAeroporto(String cidade){
        return aeroportoClient.getAeroporto(cidade);
    }
}
