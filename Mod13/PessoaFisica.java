public class PessoaFisica extends Pessoa{
    
    private double Salario;

    public PessoaFisica(String nome, long cpf, int idade) {
        super(nome, cpf, idade);
        this.setImpostos(false);
        this.setSalario(0);

    }

    @Override
    public void pagarInposto() {
        this.setImpostos(true);
        System.out.println();
        System.out.println("Impostos pagos! ");
    }

    public void receberSalario(double salario){
        this.setSalario(salario);
        System.out.println();
        System.out.println("Receu o salario no valor de: "+salario);
    }

    public void gastarDinheiro(double valor){

        if (this.getSalario() >= valor){
            this.setSalario(this.getSalario() -valor);
            System.out.println();
            System.out.println("Acabou de gastar: "+valor);
            System.out.println("Saldo atual: "+this.getSalario());

        }else{
        System.out.println();
        System.out.println("Saldo insuficiente! ");
        System.out.println("Espere seu pagamento !");
        }
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    @Override
    public String toString() {
        return 
        "\n (PessoaFisica)\n  (Nome): "+this.getNome() + "\n   (CPF): " + this.getCPF() +"\n (Idade): " + this.getIdade() + "\n (Saldo): " + Salario;
    }



    

}
