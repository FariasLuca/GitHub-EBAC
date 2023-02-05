import java.util.Scanner;

public class CalculaMedia{

    double N1, N2, N3, N4, tot;
    String name;

    void pedeNome(){
        Scanner recebeNome = new Scanner(System.in);

        System.out.print("Qual o seu Nome ? ");
        name = recebeNome.nextLine();
        System.out.println();
    }

    void pedeNota(){

        Scanner recebNota = new Scanner(System.in);

        System.out.print("Digite a sua Primeira nota : ");
        N1 = recebNota.nextDouble();


        System.out.print("Digite a sua Segunda nota  : ");
        N2 = recebNota.nextDouble();
        

        System.out.print("Digite a sua Terceira nota : ");
        N3 = recebNota.nextDouble();
       

        System.out.print("Digite a sua Quarta nota   : ");
        N4 = recebNota.nextDouble();
        
    }
    void somaNota (){
        System.out.println();
        tot = (N2 + N2 + N3 + N4) /4;
        System.out.println("=========================");
        System.out.println(name+", sua media e: "+ tot);
        System.out.println("=========================");
    }
}