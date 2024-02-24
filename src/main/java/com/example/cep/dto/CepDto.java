package com.example.cep.dto;

public class CepDto {
    private String cep;
    private String logradouro;
    private String bairro;
    private String uf;
    private String ddd;

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
