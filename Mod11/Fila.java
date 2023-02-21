import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fila {
    
    private String nome;
    private String sexo;

    List<String> Masculino = new ArrayList<>();
    List<String> Feminino = new ArrayList<>();
    public void capturaDados(){
        Scanner Name = new Scanner(System.in);
        Scanner Sexo = new Scanner(System.in);

        System.out.println("=========================");
        System.out.print("Digite seu nome: ");
         this.setNome(Name.nextLine());

        System.out.print("Qual o seu sexo (M / F): ");
         this.setSexo(Sexo.nextLine());
        System.out.println("=========================");

    }

    public void selectQueues(){

        if (this.getSexo().equals("M")) {
            Masculino.add(this.getNome());
        } else if (this.getSexo().equals("F")) {
            Feminino.add(this.getNome());
        } else {
            System.out.println("Sexo não identificado! ");
        }
    }

    public void showQueues(){
        System.out.println("Homens: "+Masculino);
        System.out.println("Mulheres: "+Feminino);
    }


    public String getNome(){
        return nome;
    }
    public String getSexo(){
        return sexo;
    }

    public void setNome(String n){
        this.nome = n;
    }
    public void setSexo(String s){
        this.sexo = s;
    }
}
