package br.com.mastertech.usuariocepservice.model;

import br.com.mastertech.usuariocepservice.client.CepDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private CepDTO cepUsuario;

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCepUsuario(CepDTO cepUsuario) {
        this.cepUsuario = cepUsuario;
    }
}
