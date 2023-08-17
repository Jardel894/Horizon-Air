package br.com.horizonair.client;

import br.com.horizonair.dto.AeroportoClientDto;
import br.com.horizonair.dto.AeroportoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "aeroporto", url ="https://www.skyscanner.pt/g/autosuggest-search/api/v1/search-flight/PT/pt-PT/")
public interface AeroportoClient {

    @GetMapping(value = "{cidade}?isDestination=false&enable_general_search_v2=true")
    List<AeroportoClientDto> getAeroporto(@PathVariable("cidade")String cidade);

}