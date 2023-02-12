import java.util.Scanner;

public class TarefaMod9{
        
    int N1;
    int N2;
    int result;
    
    public int pedeValor(){
        Scanner calcula = new Scanner(System.in);

        System.out.print("Digite o primeiro Numero  : ");
        N1 = calcula.nextInt();

        System.out.print("Digite o segundo Numero   : ");
        N2 = calcula.nextInt();

        return result = N1 + N2;
        
    }

    public int converteWrapped(){

        //Conversor de variavel
        Integer resultWrapped = Integer.valueOf(result);
        return resultWrapped;
    }
    public Integer resultSoma(){
        System.out.println("O resultado da soma e     : "+ result);
        return result;
    }
}
