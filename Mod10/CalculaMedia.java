import java.util.Scanner;

public class CalculaMedia {
    float result = 0;
    public void pedeNota(){
        Scanner N0 = new Scanner(System.in);

        System.out.println();
        System.out.println("=====================");
        System.out.println();
        System.out.print("Digite sua nota (1): ");
        float N1 = N0.nextFloat();
        System.out.print("Digite sua nota (2):");
        float N2 = N0.nextFloat();
        System.out.print("Digite sua nota (3): ");
        float N3 = N0.nextFloat();
        System.out.print("Digite sua nota (4):");
        float N4 = N0.nextFloat();
        System.out.println();
        System.out.println("=====================");
        result = (N1 + N2 + N3 + N4)/4;

    }

    public void confereMedia(){

        if (result >= 7){
            System.out.println("A sua media foi: "+ result);
            System.out.println("PARABENS voce passou de ano !");
            System.out.println("=============================");

        }else if (result >= 5 && result <= 6){
            System.out.println("A sua media foi: "+ result);
            System.out.println("Aluno em RECUPERAÇÃO !");
            System.out.println("======================");
        }else{
            System.out.println("A sua media foi: "+ result);
            System.out.println("Aluno REPROVADO !");
            System.out.println("=====================");
        }


    }
}
