public class Carro {
    
   public String marca;
   public String modelo;
   private String cor;
   public int ano;

   void imprimirCarro(){
    System.out.println("Marca: "+ marca);
    System.out.println("Modelo: "+ modelo);
    System.out.println("Ano: "+ ano);
    System.out.println("Cor: "+ cor);
   }
   void cor1(){
    this.cor = "Branco";

   }
   void cor2(){
    this.cor = "Preto";

   }
   void cor3(){
    this.cor = "Prata";
   }
}
