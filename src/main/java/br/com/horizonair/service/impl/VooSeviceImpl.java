package br.com.horizonair.service.impl;

import br.com.horizonair.converter.VooConverter;
import br.com.horizonair.dto.VooDto;
import br.com.horizonair.entites.Aeroporto;
import br.com.horizonair.entites.Voo;
import br.com.horizonair.repository.AeroportoRepository;
import br.com.horizonair.repository.VooRepository;
import br.com.horizonair.service.VooService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VooSeviceImpl  implements VooService {

    private final VooRepository vooRepository;
    private final AeroportoRepository aeroportoRepository;


    @Transactional
    public VooDto criar(VooDto vooDto) {
        Voo voo = VooConverter.toVoo(vooDto);
       List<Aeroporto> aeroportoList = aeroportoRepository.findAll();
       for (Aeroporto aeroporto : aeroportoList){
           if(voo.getOrigem().getCidadeId().contains(aeroporto.cidadeId))
               voo.setOrigem(aeroporto);
           if(voo.getDestino().getCidadeId().contains(aeroporto.cidadeId))
               voo.setDestino(aeroporto);
       }
        vooRepository.save(voo);
        return VooConverter.ToVooDto(voo);
    }
}
