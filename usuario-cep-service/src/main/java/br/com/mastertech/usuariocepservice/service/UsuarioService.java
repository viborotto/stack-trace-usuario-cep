package br.com.mastertech.usuariocepservice.service;

import br.com.mastertech.usuariocepservice.client.CepClient;
import br.com.mastertech.usuariocepservice.model.Usuario;
import br.com.mastertech.usuariocepservice.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CepClient cepClient;

    //criar usuario com o cep???
    public Usuario criar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
