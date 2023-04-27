package br.com.ebac.domain;

import java.util.Objects;

public class Pessoa {
    private String Nome;
    private String Sexo;

    public Pessoa(String nome, String sexo) {
        this.Nome = nome;
        this.Sexo = sexo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(Nome, pessoa.Nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome);
    }

    @Override
    public String toString() {
        return "\n("+Sexo+") <> " +
                " Nome:" + Nome;

    }
}
