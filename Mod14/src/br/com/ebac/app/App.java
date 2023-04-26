package br.com.ebac.app;

import br.com.ebac.dao.ClienteMapDAO;
import br.com.ebac.dao.IClienteDAO;
import br.com.ebac.domain.Cliente;

import javax.swing.*;

public class App {
    public static IClienteDAO Icliente;
    public static void main(String args[]){
        Icliente = new ClienteMapDAO();

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

            }

            if("3".equals(Opsao)){

            }

            if("4".equals(Opsao)){

            }

            if("5".equals(Opsao)){

            }

            if("6".equals(Opsao)){

            }
            Opsao = JOptionPane.showInputDialog(null,"DIGITE: (1).Cadastro  (2).Consulta  (3).Exclusão  (4).Alteração  (5).Mostrar Lista  (6).Sair","Bem Vindo",JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public static Boolean cadastrarCliente(String dados){
        String[] dadosSeparados;
        dadosSeparados = dados.split(",");

        if(isArrayValido(dados)){
            Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3]);
            Icliente.cadastrar(cliente);

            return true;
        }else{
            return false;
        }

    }
    public static Boolean isValido(String Opsao){
        if("1".equals(Opsao) || "2".equals(Opsao) || "3".equals(Opsao) || "4".equals(Opsao) || "5".equals(Opsao) || "6".equals(Opsao)){
            return true;

        }else{
            return false;
        }
    }
    public static Boolean isArrayValido(String dados){
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
}
