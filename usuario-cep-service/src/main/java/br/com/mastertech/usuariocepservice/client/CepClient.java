package br.com.mastertech.usuariocepservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "api-consulta-cep")
public interface CepClient {

    @GetMapping("/{cep}")
    String getCep(@PathVariable CepDTO cep);
}