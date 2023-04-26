package br.com.ebac.dao;

import br.com.ebac.domain.Cliente;

import javax.swing.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO{

    Map<Long, Cliente> Chamada;
    public ClienteMapDAO(){
        this.Chamada = new HashMap<>();
    }
    @Override
    public Boolean cadastrar(Cliente cliente) {
        if(this.Chamada.containsKey(cliente.getCPF())){

            JOptionPane.showMessageDialog(null,"O cliente já está cadastrado","Erro de Cadastro",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
            this.Chamada.put(cliente.getCPF(),cliente);
            JOptionPane.showMessageDialog(null,"Cliente Cadastrado com SUCESSO !","Cliente Cadastrado",JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }

    @Override
    public Boolean excluir(Long cpf) {
        if(this.Chamada.containsKey(cpf)){

            Cliente clienteCad = this.Chamada.get(cpf);
            this.Chamada.remove(cpf,clienteCad);
            JOptionPane.showMessageDialog(null,"Cliente removido com sucesso !","Remoção de Cliente", JOptionPane.INFORMATION_MESSAGE);
            return true;

        }else{
            return false;
        }
    }

    @Override
    public Boolean alterar(Cliente cliente) {

        if (this.Chamada.containsKey(cliente.getCPF())){

            Cliente clienteCad = this.Chamada.get(cliente.getCPF());

            clienteCad.setNome(cliente.getNome());
            clienteCad.setCelular(cliente.getCelular());
            //clienteCad.setEstado(cliente.getEstado());
            //clienteCad.setCidade(cliente.getCidade());
            clienteCad.setEnd(cliente.getEnd());
            //clienteCad.setNumero(cliente.getNumero());

            JOptionPane.showMessageDialog(null,"Cliente alterado com SUCESSO !", "Alteração de Cliente",JOptionPane.INFORMATION_MESSAGE);
            return true;
        }else{
            JOptionPane.showMessageDialog(null,"Não foi possivel encontrar o cliente \n para fazer a alteração, confira o CPF e tente novamente","Erro de Alteração",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        if (this.Chamada.containsKey(cpf)){

            Cliente clienteCad = this.Chamada.get(cpf);
            JOptionPane.showMessageDialog(null,"Cliente encontrado ! "+clienteCad.toString(),"Consulta",JOptionPane.INFORMATION_MESSAGE);
            return clienteCad;

        }else{

            JOptionPane.showMessageDialog(null,"Não foi possivel encontrar p cliente \n confira o CPF e tente novamente","Erro de Consulta",JOptionPane.INFORMATION_MESSAGE);
            return null;

        }
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        JOptionPane.showMessageDialog(null,"Mostrando a Lista de clientes: "+this.Chamada.values(),"Lista de Clientes",JOptionPane.INFORMATION_MESSAGE);
        return this.Chamada.values();
    }
}
