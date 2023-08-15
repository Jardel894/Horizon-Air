package br.com.horizonair.controller;

import br.com.horizonair.dto.AeroportoClientDto;
import br.com.horizonair.dto.AeroportoDto;
import br.com.horizonair.service.AeroportoSevice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/aeroporto")
public class AeroportoController {

    private final AeroportoSevice aeroportoSevice;

    @GetMapping("/{cidade}")
    public List<AeroportoClientDto> buscarAeroporto(@PathVariable String cidade) {
        return aeroportoSevice.getAeroporto(cidade);

    }
}
