import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner name = new Scanner(System.in);
        CalculaMedia media1 = new CalculaMedia();

        System.out.println();
        System.out.println("Digite seu nome: ");
        String nome = name.nextLine();

        System.out.println();
        System.out.println("Bem vindo, "+ nome);
        System.out.println();

        media1.pedeNota();
        media1.confereMedia();


    }
}
