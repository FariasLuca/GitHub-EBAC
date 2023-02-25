import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

public class Estrutura {
 
    public void testArray(){
        Scanner names = new Scanner(System.in);
        
        System.out.println("============================");
        System.out.println();
        System.out.println("Digite nomes separados por ,");
        String nome0 = names.nextLine();
        System.out.println();
        System.out.println("============================");

        String[] nome = nome0.split(",");
        List<String> chamada = new ArrayList<>();
       
        for (int i = 0; i < nome.length; i++){
            chamada.add(nome[i]);
        }
        Collections.sort(chamada);

        System.out.println("===========");
        System.out.println();

        for (String elemento : chamada){
            System.out.println(elemento);
        }
        System.out.println();
        System.out.println("===========");

    }
}
