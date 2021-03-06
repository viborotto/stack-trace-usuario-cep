package br.com.mastertech.apiconsultacep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViaCepController {

    @Autowired
    private CepClient cepClient;

    //consome o client com a cep passada, lembrando que rotas sempre String e nao objeto
    @GetMapping("/{cep}")
    public String getCep(@PathVariable String cep){

        return cepClient.getCep(cep);
    }
}
