package com.example.cep.http;

import com.example.cep.domain.Cep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep", url = "viacep.com.br/ws")
public interface ViaCepClient {

    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    Cep buscar(@PathVariable("cep") Long cep);
}
