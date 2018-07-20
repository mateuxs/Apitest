package com.example.mateu.api_test;

public class Endereco {
    private String cep;
    private String uf;
    private String localidade;
    private String logradouro;

    public String getCep() {
        return cep;
    }

    public String getUf() {
        return uf;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
