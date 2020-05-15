package br.com.mastertech.usuariocepservice.model;

public class Usuario {

    private String nome;

    private String cepUsuario;

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCepUsuario(String cepUsuario) {
        this.cepUsuario = cepUsuario;
    }

    public String getCepUsuario() {
        return cepUsuario;
    }
}
