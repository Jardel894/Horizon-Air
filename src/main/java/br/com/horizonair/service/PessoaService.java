package br.com.horizonair.service;

import br.com.horizonair.entites.Pessoa;

import java.util.Optional;

public interface PessoaService {

    Optional<Pessoa> buscarPessoaPorCpf(String cpf);

    Pessoa save(Pessoa map);
}
