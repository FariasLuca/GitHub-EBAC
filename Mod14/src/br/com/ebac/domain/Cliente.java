package br.com.ebac.domain;

import java.util.Objects;

public class Cliente {
    private String Nome;
    private Long CPF;
    private Long Celular;
    private String End;
    private Integer Numero;
    private String Estado;
    private String Cidade;

    public Cliente(String nome, String CPF, String celular, String end) {
        this.Nome = nome;
        this.CPF = Long.parseLong(CPF.trim());
        this.Celular = Long.parseLong(celular.trim());
        this.End = end;

        //this.Numero = Integer.parseInt(numero.trim());
        //this.Estado = estado;
        //this.Cidade = cidade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Long getCPF() {
        return CPF;
    }

    public void setCPF(Long CPF) {
        this.CPF = CPF;
    }

    public Long getCelular() {
        return Celular;
    }

    public void setCelular(Long celular) {
        Celular = celular;
    }

    public String getEnd() {
        return End;
    }

    public void setEnd(String end) {
        End = end;
    }

    /*

    public Integer getNumero() {
        return Numero;
    }
    public void setNumero(Integer numero) {
        Numero = numero;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }
*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(CPF, cliente.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CPF);
    }

    @Override
    public String toString() {
        return "\n (Cliente) <> " +
                "Nome:" + Nome + " /  CPF:" + CPF +" / Celular: "+Celular+ " / Endereço: "+End;
    }
}
