package com.example.cep.infra.erro;

import java.util.List;

public class ErroResponse {
    private int status;
    private List<String> mensagem;
    private String timestamp;
    private String endpoint;
    private String projeto;

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public void setMensagem(List<String> mensagem) {
        this.mensagem = mensagem;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getProjeto() {
        return projeto;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public List<String> getMensagem() {
        return mensagem;
    }

    public int getStatus() {
        return status;
    }
}
