package br.com.mastertech.apiconsultacep.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="https://viacep.com.br/ws", name = "cep")
public interface CepClient {

    @GetMapping("/{cep}/json")
    String getCep(@PathVariable String cep);
}
