package br.com.mastertech.usuariocepservice.service;

import br.com.mastertech.usuariocepservice.client.CepClient;
import br.com.mastertech.usuariocepservice.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private CepClient cepClient;

    //aqui como nao queremos armazenar no DB usaremos direto do client, entao vamos setar o cep do usuario utilizando  client que construimos no outro microsservico
    public Usuario criar(String nome, String cep){
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setCepUsuario(cepClient.getCep(cep));
        return usuario;
    }
}
