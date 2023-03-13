package com.marciavicentini.ApiRestfulExample.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import com.marciavicentini.ApiRestfulExample.domain.Professor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Document(collection = "professor")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Professor extends Pessoa implements Serializable {

    private String id;
    private String formacao;
    private String area;
    private String anoAdmissao;

    public Professor(String name, String cpf, Date dataNascimento, String celular, String formacao, String area, String anoAdmissao) {
        super(name, cpf, dataNascimento, celular);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return Objects.equals(id, professor.id)
                && Objects.equals(formacao, professor.formacao)
                && Objects.equals(area, professor.area)
                && Objects.equals(anoAdmissao, professor.anoAdmissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, formacao, area, anoAdmissao);
    }
}
