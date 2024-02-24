package com.example.cep.service;

import com.example.cep.domain.Cep;
import com.example.cep.dto.CepDto;
import com.example.cep.http.ViaCepClient;
import com.example.cep.infra.exception.CepException;
import com.example.cep.mapper.CepMapper;
import com.example.cep.repository.CepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CepService {
    @Autowired
    private CepRepository cepRepository;

    @Autowired
    private CepMapper cepMapper;

    @Autowired
    private ViaCepClient viaCepClient;

    public CepDto buscarCep(String cep) {
        Cep consultaCep = new Cep();
        CepDto dto = new CepDto();
        consultaCep = cepRepository.findCepByCep(cep);
        if (Objects.nonNull(consultaCep)) {
            dto = cepMapper.mapeiaCepParaDto(consultaCep);
            return dto;
        }
        try {
            consultaCep = viaCepClient.buscar(this.montarcep(cep));
            if (consultaCep.getCep().equals(null)) {
                throw new CepException("Ocorreu um erro ao consulta cep");
            }
        } catch (Exception e) {
            throw new CepException("Ocorreu um erro ao consulta cep");
        }
        consultaCep = cepRepository.save(this.verificaDados(consultaCep));
        dto = cepMapper.mapeiaCepParaDto(consultaCep);
        return dto;
    }

    private Cep verificaDados(Cep consultaCep) {
        Cep cep = new Cep();
        cep.setId(null);
        cep.setCep(!consultaCep.getCep().equals(null) ? consultaCep.getCep() : "");
        cep.setBairro(!consultaCep.getBairro().equals(null) ? consultaCep.getBairro() : "");
        cep.setLogradouro(!consultaCep.getLogradouro().equals(null) ? consultaCep.getLogradouro() : "");
        cep.setDdd(!consultaCep.getDdd().equals(null) ? consultaCep.getDdd() : "");
        return cep;
    }

    private Long montarcep(String cep) {
        if (!cep.isEmpty()) {
            cep = cep.replace("-", "");
            cep = cep.replace(".", "");
            cep = cep.replace(" ", "").trim();
            return Long.valueOf(cep);
        }
        return 00000000L;
    }
}
