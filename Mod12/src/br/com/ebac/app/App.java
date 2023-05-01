package br.com.ebac.app;

import br.com.ebac.dao.IPessoaDAO;
import br.com.ebac.dao.PessoaDAO;
import br.com.ebac.domain.Pessoa;

import javax.swing.*;

public class App {

    public static IPessoaDAO Ipessoa;
    public static void main(String args[]){
        Ipessoa = new PessoaDAO();

        String dados = JOptionPane.showInputDialog(null,"DIGITE: (1).Cadastrar  (2).Remover  (3).Lista Masculino  (4).Lista Feminino  (5).Lista completa   (6).Sair","Bem vindo",JOptionPane.INFORMATION_MESSAGE);
        while (!isValido(dados)){
            if("".equals(dados)){
               sair();
            }
            dados = JOptionPane.showInputDialog(null,"Comando INVALIDO \n DIGITE: (1).Cadastrar  (2).Remover  (3).Lista Masculino  (4).Lista Feminino  (5).Lista completa   (6).Sair","Bem vindo",JOptionPane.INFORMATION_MESSAGE);

        }
        while (isValido(dados)){

            if("1".equals(dados)){
                dados = JOptionPane.showInputDialog(null,"Para fazer um caadastro digite o NOME e SEXO do usuario \n o Sexo deve conter apenas M/F \n EX: Lucas,M","Bem vindo",JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            }
            if("2".equals(dados)){
                String usuario = JOptionPane.showInputDialog(null,"Digite o usuario que deseja remover \n o Sexo deve conter apenas M/F \n EX: Lucas,M","Remover",JOptionPane.INFORMATION_MESSAGE);
                remover(usuario);
            }
            if("3".equals(dados)){
                listaM();
            }
            if("4".equals(dados)){
                listaF();
            }
            if("5".equals(dados)){
                verTodos();
            }
            if("6".equals(dados)){
                sair();
            }

            dados = JOptionPane.showInputDialog(null,"DIGITE: (1).Cadastrar  (2).Remover  (3).Lista Masculino  (4).Lista Feminino  (5).Lista completa   (6).Sair","Bem vindo",JOptionPane.INFORMATION_MESSAGE);

        }
    }
    public static void cadastrar(String dados){

        String[] clienteArray = dados.split(",");

        if(clienteArray.length == 2){

            Pessoa pessoa = new Pessoa(clienteArray[0],clienteArray[1]);
            Ipessoa.cadastrar(pessoa);

        }else{
            JOptionPane.showMessageDialog(null,"Digite Somente os dados de NOME e SEXO \n nem MAIS nem Menos doque isso","Bem vindo",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void remover(String usuario){
        String[] User = usuario.split(",");
        if(User.length == 2) {
            Pessoa Usuario = new Pessoa(User[0], User[1]);
            Ipessoa.remover(Usuario);
        }else{
            JOptionPane.showMessageDialog(null,"Digite as Informações conforme solicitado ","Erro de Operação",JOptionPane.INFORMATION_MESSAGE);

        }
    }


    public static void listaM(){
        Ipessoa.consultarM();
    }
    public static void listaF(){
        Ipessoa.consultarF();
    }
    public static void verTodos(){

        
        Ipessoa.verTodos();
    }

    public static void sair(){
        JOptionPane.showMessageDialog(null,"Saindo  :( ","Exite",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    public static Boolean isValido(String dados){
       if("1".equals(dados) || "2".equals(dados) || "3".equals(dados) || "4".equals(dados) || "5".equals(dados) || "6".equals(dados)){
           return true;
       }
        return false;
    }
}

/*
─────▀▄▀─────▄─────▄
──▄███████▄──▀██▄██▀
▄█████▀█████▄──▄█
███████▀████████▀
─▄▄▄▄▄▄███████▀
 Lucas Farias.

*/
