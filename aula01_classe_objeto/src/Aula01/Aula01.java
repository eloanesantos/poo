package Aula01;

public class Aula01 {
    public static void main(String[] args) {
        Carro car1 = new Carro();

         car1.marca = "toyota";
         car1.modelo = "corola";
         car1.cor = "preto";
         car1.ano = 2025;
         car1.potencia = 120;

        System.out.println("marca: " + car1.marca);
        car1.ligar();
        car1.desligar();

    }
}
