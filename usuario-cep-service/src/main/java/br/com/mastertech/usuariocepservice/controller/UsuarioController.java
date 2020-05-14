package br.com.mastertech.usuariocepservice.controller;

import br.com.mastertech.usuariocepservice.client.CepDTO;
import br.com.mastertech.usuariocepservice.dto.UsuarioDTO;
import br.com.mastertech.usuariocepservice.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/{usuario}/{cep}")
    private ResponseEntity<UsuarioDTO> criarUsuario(@RequestBody CepDTO cep){

    }
}
