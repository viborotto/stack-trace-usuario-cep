package br.com.mastertech.usuariocepservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//sempre que quiser comunicar entre micro servicos utilizar o feign client, nesse caso nao precisamos do DTO do outro, mas podemos precisar
@FeignClient(name = "viacep-service")
public interface CepClient {

    @GetMapping("/{cep}")
    String getCep(@PathVariable String cep);
}
