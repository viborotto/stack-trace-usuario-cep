package br.com.mastertech.usuariocepservice.controller;

import br.com.mastertech.usuariocepservice.dto.UsuarioDTO;
import br.com.mastertech.usuariocepservice.model.Usuario;
import br.com.mastertech.usuariocepservice.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/{nome}/{cep}")
    private Usuario criarUsuario(@PathVariable String nome, @PathVariable String cep){
        return usuarioService.criar(nome, cep);
    }
}
