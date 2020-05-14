package br.com.mastertech.apiconsultacep.controller;

import br.com.mastertech.apiconsultacep.model.CepDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViaCepController {

    @Autowired
    private CepClient cepClient;

    @GetMapping("/{cep}")
    public String getCep(@PathVariable CepDTO cep){

        return cepClient.getCep(cep);
    }
}
