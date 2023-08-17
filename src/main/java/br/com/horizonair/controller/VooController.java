package br.com.horizonair.controller;

import br.com.horizonair.dto.VooDto;
import br.com.horizonair.dto.VooDtoFilter;
import br.com.horizonair.dto.VooDtoUpdateRequest;
import br.com.horizonair.entites.Voo;
import br.com.horizonair.service.VooService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("v1/voo")
public class VooController {

    private final VooService vooService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criar(@RequestBody VooDto vooDto){
        vooService.criar(vooDto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Voo> buscarVoo(VooDtoFilter vooDtoFilter) {
        return vooService.buscarVoo(vooDtoFilter);
    }

    @PutMapping("{codigoVoo}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atulizarVoo(@PathVariable Long codigoVoo, @RequestBody VooDtoUpdateRequest vooDtoUpdateRequest){

         vooService.atualizarVoo(codigoVoo, vooDtoUpdateRequest);

    }
}
