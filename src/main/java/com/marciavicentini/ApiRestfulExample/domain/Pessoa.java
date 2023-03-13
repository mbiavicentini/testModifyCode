package com.marciavicentini.ApiRestfulExample.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Document(collection = "pessoa")
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa implements Serializable {

    private String name;
    private String cpf;
    private Date dataNascimento;
    private String celular;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return  Objects.equals(name, pessoa.name)
                && Objects.equals(cpf, pessoa.cpf)
                && Objects.equals(dataNascimento, pessoa.dataNascimento)
                && Objects.equals(celular, pessoa.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, cpf, dataNascimento, celular);
    }
}
