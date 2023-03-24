public class Main {
    
    public static void main(String args[]){
        PessoaFisica   PF = new PessoaFisica("Lucas", 123, 20);
        PessoaJuridica PJ = new PessoaJuridica("Marcos", 456, 25, 1230001, "Movelar");

        //Teste dos Metodos para Pessoa Fisica
        System.out.println("::::::::::::::::::::::::::::::::::");
        System.out.println(PF.toString());

        PF.receberSalario(2000);
        PF.pagarInposto();
        PF.gastarDinheiro(70);
        System.out.println(PF.toString());

        System.out.println("::::::::::::::::::::::::::::::::::");
        System.out.println("::::::::::::::::::::::::::::::::::");

        //Teste dos Metodos para Pessoa Juridica
        System.out.println(PJ.toString());

        PJ.prestarServicos();
        PJ.recerDeClientes(2500);
        PF.pagarInposto();
        PJ.declararRenda();
        System.out.println(PJ.toString());

        System.out.println("::::::::::::::::::::::::::::::::::");
    }
}
