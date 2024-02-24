package com.example.cep.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "cep")
public class Cep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    private String logradouro;
    private String bairro;
    private String uf;
    private String ddd;

    public Cep() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Long getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getDdd() {
        return ddd;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getUf() {
        return uf;
    }
}
