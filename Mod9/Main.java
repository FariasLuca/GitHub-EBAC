public class Main{

    public static void main(String[] args){

        //  Nessa tarefa do Mod(9) irei converter uma 
        //  Variavel primitiva para seu modo Wrapped
        //  A conversão ocorre dentro do metodo
        //  "converteWrapped" que se encontra na classe "TarefaMod9"

        TarefaMod9 calculadora = new TarefaMod9();

        System.out.println("===============================");
        System.out.println("     Calculadolra Simples.     ");
        System.out.println("===============================");
        System.out.println();

        calculadora.pedeValor();

        System.out.println();
        System.out.println("===============================");

        calculadora.converteWrapped();
        calculadora.resultSoma();
        System.out.println("===============================");

    }

}