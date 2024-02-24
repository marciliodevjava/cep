package com.example.cep.mapper;

import com.example.cep.domain.Cep;
import com.example.cep.dto.CepDto;
import org.springframework.stereotype.Component;

@Component
public class CepMapper {
    public CepDto mapeiaCepParaDto(Cep consultaCep) {
        CepDto dto = new CepDto();
        dto.setCep(consultaCep.getCep());
        dto.setDdd(consultaCep.getDdd());
        dto.setLogradouro(consultaCep.getLogradouro());
        dto.setBairro(consultaCep.getBairro());
        dto.setUf(consultaCep.getUf());
        return dto;
    }
}
