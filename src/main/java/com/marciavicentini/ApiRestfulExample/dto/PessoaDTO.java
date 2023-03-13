package com.marciavicentini.ApiRestfulExample.dto;

import java.io.Serializable;
import java.util.Date;

public class PessoaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String n;
    private String cpf;
    private Date data;
    private String fone;
    private String celular;

    public PessoaDTO(){

    }

    public PessoaDTO(String id, String n, String cpf, Date dataNascimento, String fone, String celular) {
        this.id = id;
        this.n = n;
        this.cpf = cpf;
        this.data = dataNascimento;
        this.fone = fone;
        this.celular = celular;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return data;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.data = dataNascimento;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
