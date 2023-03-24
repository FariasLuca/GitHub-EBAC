public class PessoaJuridica extends Pessoa{

    private long CNPJ;
    private double Saldo;
    private String NomeEmpresa;
    private boolean Declaracao;

    public PessoaJuridica(String nome,long cpf, int idade, long cnpj, String Empresa) {
        super(nome,cpf, idade);
        this.setImpostos(false);
        this.setCNPJ(cnpj);
        this.setNomeEmpresa(Empresa);
    
    }

    @Override
    public void pagarInposto() {
        this.setImpostos(true);
        System.out.println();
        System.out.println("Impostos Pagos !");

    }

    public void declararRenda(){
        this.setDeclaracao(true);
        System.out.println();
        System.out.println("Sua renda foi Declarada !");
    }

    public void prestarServicos(){
        System.out.println();
        System.out.println("Prestacao de servicos realizada !");
    }

    public void recerDeClientes(double valor){
        this.setSaldo(valor);
    }

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long cnpj) {
        CNPJ = cnpj;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        NomeEmpresa = nomeEmpresa;
    }

    public boolean getDeclaracao() {
        return Declaracao;
    }

    public void setDeclaracao(boolean declaracao) {
        Declaracao = declaracao;
    }
    @Override
    public String toString() {
        return 
        "\n (PessoaJuridica) \n    (Nome): "+this.getNome() +"\n     (CPF): "+this.getCPF() +  
        "\n    (CNPJ): " + CNPJ + "\n   (Saldo): " + Saldo + "\n (Empresa): " + NomeEmpresa;
    }

    

}