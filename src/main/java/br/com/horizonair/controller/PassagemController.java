package br.com.horizonair.controller;


import br.com.horizonair.dto.PassagemDtoRequest;
import br.com.horizonair.dto.PassagemDtoResponse;
import br.com.horizonair.enums.EnumPrecoClasse;
import br.com.horizonair.service.PassagemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/passagem")
@RequiredArgsConstructor
public class PassagemController {

    private final PassagemService passagemService;

    @PostMapping("/voo/{vooId}/classe/{enumPrecoClasse}")
    @ResponseStatus(HttpStatus.CREATED)
    public PassagemDtoResponse comprarPassagem(@PathVariable Long vooId, @PathVariable EnumPrecoClasse enumPrecoClasse, @RequestBody PassagemDtoRequest passagemDtoRequest){
        return passagemService.comprarPassagem(vooId,enumPrecoClasse, passagemDtoRequest) ;
    }
}