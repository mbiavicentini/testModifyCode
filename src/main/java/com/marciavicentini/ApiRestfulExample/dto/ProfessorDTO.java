package com.marciavicentini.ApiRestfulExample.dto;

import com.marciavicentini.ApiRestfulExample.domain.Pessoa;

import java.io.Serializable;

public class ProfessorDTO extends PessoaDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String formacao;
    private String area;
    private String anoAdmissao;

    public ProfessorDTO(){

    }

    public ProfessorDTO(String id, String formacao, String area, String anoAdmissao) {
        this.id = id;
        this.formacao = formacao;
        this.area = area;
        this.anoAdmissao = anoAdmissao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAnoAdmissao() {
        return anoAdmissao;
    }

    public void setAnoAdmissao(String anoAdmissao) {
        this.anoAdmissao = anoAdmissao;
    }
}
