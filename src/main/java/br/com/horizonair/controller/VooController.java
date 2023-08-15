package br.com.horizonair.controller;

import br.com.horizonair.dto.VooDto;
import br.com.horizonair.service.VooService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/voo")
public class VooController {

    private final VooService vooService;


    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public VooDto criar(@RequestBody VooDto vooDto){
       return vooService.criar(vooDto);

    }
}
