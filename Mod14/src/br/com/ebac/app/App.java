package br.com.ebac.app;

import br.com.ebac.dao.ClienteMapDAO;
import br.com.ebac.dao.IClienteDAO;
import br.com.ebac.domain.Cliente;

import javax.swing.*;


public class App {
    public static IClienteDAO Icliente;
    public static void main(String args[]){
        Icliente = new ClienteMapDAO();

        //Lucas,712,924,Lameira

        String Opsao = JOptionPane.showInputDialog(null,"DIGITE: (1).Cadastro  (2).Consulta  (3).Exclusão  (4).Alteração  (5).Mostrar Lista  (6).Sair","Bem Vindo",JOptionPane.INFORMATION_MESSAGE);

        while (!isValido(Opsao)){
            if("".equals(Opsao)){
                System.exit(0);
            }
            Opsao = JOptionPane.showInputDialog(null,"Opsão INVALIDA \n DIGITE: (1).Cadastro  (2).Consulta  (3).Exclusão  (4).Alteração  (5).Mostrar Lista  (6).Sair","Bem Vindo",JOptionPane.INFORMATION_MESSAGE);

        }

        while (isValido(Opsao)){
            if("1".equals(Opsao)){

                String cliente  = JOptionPane.showInputDialog(null,"Digite os seguintes Dados separados por VIRGULA \n Nome, CPF, Celular, Endereço, ","Cadastro",JOptionPane.INFORMATION_MESSAGE);
                cadastrarCliente(cliente);
            }

            if("2".equals(Opsao)){

                String cpf = JOptionPane.showInputDialog(null,"Digite o Cpf do cliente para realizar a consulta","Cunsultar",JOptionPane.INFORMATION_MESSAGE);
                consultarCliente(cpf);
            }

            if("3".equals(Opsao)){
                String cpf = JOptionPane.showInputDialog(null,"Digite o CPF do cliente que desaja excluir","Excluir",JOptionPane.INFORMATION_MESSAGE);
                excluirCliente(cpf);
            }

            if("4".equals(Opsao)){
                String cpf = JOptionPane.showInputDialog(null,"Digite o CPF do cliente que desaja ALTERAR","Atualizar Cliente",JOptionPane.INFORMATION_MESSAGE);
                alterarCliente(cpf);
            }

            if("5".equals(Opsao)){
                mostrarLista();
            }

            if("6".equals(Opsao)){
                sair();

            }
            Opsao = JOptionPane.showInputDialog(null,"DIGITE: (1).Cadastro  (2).Consulta  (3).Exclusão  (4).Alteração  (5).Mostrar Lista  (6).Sair","Bem Vindo",JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public static void cadastrarCliente(String dados){
        String[] dadosSeparados;
        dadosSeparados = dados.split(",");

        if(isArrayValido1(dados)){
            Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3]);
            Icliente.cadastrar(cliente);

        }
    }

    public static void consultarCliente(String cpf){
        if(isCpfValido(cpf)){
            Long CPF = Long.parseLong(cpf.trim());
            Icliente.consultar(CPF);
        }
    }

    public static void excluirCliente(String cpf){
        if(isCpfValido(cpf)){
            Long CPF = Long.parseLong(cpf.trim());
            Icliente.excluir(CPF);
        }
    }


    public static void alterarCliente(String cpf){
        if(isCpfValido(cpf)){
            Long CPF = Long.parseLong(cpf.trim());
            if(Icliente.consultar(CPF) != null){
                String dados = JOptionPane.showInputDialog(null,"Para fazer a alteração digite os seguintes dados separados por VIRGULA \n Nome, Celular, Endereço","Alteração",JOptionPane.INFORMATION_MESSAGE);

                String[] dadosSeparados = dados.split(",");

                if (isArrayValido2(dados)){
                    Cliente cliente = new Cliente(dadosSeparados[0],cpf,dadosSeparados[1],dadosSeparados[2]);
                    Icliente.alterar(cliente);
                }


            }
        }
    }


    public static void mostrarLista(){
        Icliente.buscarTodos();
    }


    public static void sair(){
        JOptionPane.showMessageDialog(null,
                "╭━┳━╭━╭━╮╮      \n" +
                        "┃┈┈┈┣▅╋▅┫┃      \n" +
                        "┃┈┃┈╰━╰━━━━━━╮  \n" +
                        "╰┳╯┈┈┈┈┈┈┈┈┈◢▉◣\n" +
                        "╲┃┈┈┈┈┈┈┈┈┈▉▉▉  \n" +
                        "╲┃┈┈┈┈┈┈┈┈┈◥▉◤ \n" +
                        "╲┃┈┈┈┈╭━┳━━━━╯  \n" +
                        "╲┣━━━━━━┫       \n" +
                        "  ▬ Saindo ▬ ","SAINDO DO PROGRAMA",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }


    public static Boolean isValido(String Opsao){
        if("1".equals(Opsao) || "2".equals(Opsao) || "3".equals(Opsao) || "4".equals(Opsao) || "5".equals(Opsao) || "6".equals(Opsao)){
            return true;

        }else{
            return false;
        }
    }
    public static Boolean isArrayValido1(String dados){
        String[] dadosSeparados;
        dadosSeparados = dados.split(",");

        if(dadosSeparados.length < 4){
            JOptionPane.showMessageDialog(null,"Para registrar um cliente \n Digite todas as informações obrigatorias","Erro de Cadastro",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(dadosSeparados.length > 4){
            JOptionPane.showMessageDialog(null,"Você digitou mais informações doque solicitado ! \n Passe somente o necessário para o cadastro", "Erro de Cadastro",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
            return true;
        }

    }
    public static Boolean isArrayValido2(String dados){
        String[] dadosSeparados;
        dadosSeparados = dados.split(",");

        if(dadosSeparados.length < 3){
            JOptionPane.showMessageDialog(null,"Para registrar um cliente \n Digite todas as informações obrigatorias","Erro de Cadastro",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(dadosSeparados.length > 3){
            JOptionPane.showMessageDialog(null,"Você digitou mais informações doque solicitado ! \n Passe somente o necessário para o cadastro", "Erro de Cadastro",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
            return true;
        }

    }
    public static Boolean isCpfValido(String cpf){
        String CPF = cpf;
        Boolean todosNumeros;

        for(int i = 0; i < CPF.length(); i++){

            Character c = CPF.charAt(i);
            todosNumeros = Character.isDigit(c);

            if(todosNumeros.equals(false)){
                JOptionPane.showMessageDialog(null,"O CPF não foi digitado corretamente \n Coque apenas NUMEROS","Erro de Consulta",JOptionPane.INFORMATION_MESSAGE);

                return false;
            }
        }
        return true;
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

