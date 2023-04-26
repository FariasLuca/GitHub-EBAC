public abstract class Pessoa{

    private String nome;
    private long CPF;
    private int idade;
    private boolean Impostos;

    public Pessoa(String nome, long cpf, int idade) {
        this.setNome(nome);
        this.setCPF(cpf);
        this.setIdade(idade);
    }

    public abstract void pagarInposto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long cPF) {
        this.CPF = cPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getImpostos() {
        return Impostos;
    }

    public void setImpostos(boolean impostos) {
        this.Impostos = impostos;
    }

    
}