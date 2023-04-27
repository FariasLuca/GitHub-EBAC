package br.com.ebac.dao;

import br.com.ebac.domain.Pessoa;

import javax.swing.*;
import java.util.*;

public class PessoaDAO implements IPessoaDAO{

    public List<Pessoa> Masculino;
    public List<Pessoa> Feminino;

    public PessoaDAO(){
        this.Masculino = new ArrayList<>();
        this.Feminino = new ArrayList<>();
    }
    @Override
    public Boolean cadastrar(Pessoa pessoa) {
        String sexo = pessoa.getSexo();

        if("m".equals(sexo) || "M".equals(sexo)){
            pessoa.setSexo("M");

            if(this.Masculino.contains(pessoa)){
                JOptionPane.showMessageDialog(null,"Erro de Operação \n O Nome de usuario já se encontra cadastrado","Cadastro de Usuario",JOptionPane.INFORMATION_MESSAGE);
                return false;

            }else{

                this.Masculino.add(pessoa);
                JOptionPane.showMessageDialog(null,"O usuario foi cadastrado com Sucesso","Cadastro de Uruario",JOptionPane.INFORMATION_MESSAGE);
                return true;
            }

        }else  if("f".equals(sexo) || "F".equals(sexo)){
            pessoa.setSexo("F");

            if(this.Feminino.contains(pessoa)){
                JOptionPane.showMessageDialog(null,"Erro de Operação \n O Nome de usuario já se encontra cadastrado","Cadastro de Usuario",JOptionPane.INFORMATION_MESSAGE);
                return false;

            }else{

                this.Feminino.add(pessoa);
                JOptionPane.showMessageDialog(null,"O usuario foi cadastrado com Sucesso","Cadastro de Uruario",JOptionPane.INFORMATION_MESSAGE);
                return true;
            }

        }else{
            JOptionPane.showMessageDialog(null,"O sexo não foi identificado Digite: M/F \n EX: Lucas,M");
            return false;
        }
    }

    @Override
    public Boolean remover(Pessoa pessoa) {
        if(this.Masculino.contains(pessoa)){

            this.Masculino.remove(pessoa);
            JOptionPane.showMessageDialog(null, "Usuario Removido com sucesso", "Excluir", JOptionPane.INFORMATION_MESSAGE);
            return true;

        }else if(this.Feminino.contains(pessoa)){

            this.Feminino.remove(pessoa);
            JOptionPane.showMessageDialog(null, "Usuario Removido com sucesso", "Excluir", JOptionPane.INFORMATION_MESSAGE);
            return true;

        }else{
            JOptionPane.showMessageDialog(null, "Usuario Não encontrado", "Erro de Operação !", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    @Override
    public void consultarM() {
        JOptionPane.showMessageDialog(null, "Usuarios do Sexo Masculino: "+this.Masculino, "Excluir", JOptionPane.INFORMATION_MESSAGE);

    }

    @Override
    public void consultarF() {
        JOptionPane.showMessageDialog(null, "Usuarios do Sexo Feminino:  "+this.Feminino, "Excluir", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void verTodos() {
        JOptionPane.showMessageDialog(null, "Todos Usuarios:  "+this.Feminino +this.Masculino, "Lista de Usuários", JOptionPane.INFORMATION_MESSAGE);

    }
}