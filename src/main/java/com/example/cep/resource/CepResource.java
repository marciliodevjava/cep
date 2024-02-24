package com.example.cep.resource;

import com.example.cep.dto.CepDto;
import com.example.cep.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class CepResource {
    @Autowired
    private CepService cepService;

    @GetMapping
    public ResponseEntity<CepDto> getCep(@RequestParam(name = "cep", required = true) String cep) {
        CepDto dto = cepService.buscarCep(cep);
        return ResponseEntity.ok(dto);
    }
}
