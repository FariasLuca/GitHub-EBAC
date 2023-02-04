public class Principal {
    
    public static void main(String []args){

        Carro carro1 = new Carro();

        carro1.marca = "Chevrolet";
        carro1.modelo = "Celta";
        carro1.ano = 2015;
        
        carro1.cor1(); // Altere entre os métodos: " cor1, cor2 e cor3", para mudar a cor do carro !
        carro1.imprimirCarro();
    }
}
