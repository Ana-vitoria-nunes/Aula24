package Exercicio6;
public class Main {
    public static void main(String[] args) {
        Quadro quadro=new Quadro(7);
        System.out.println("Os lado atual do quandrado equivale a "+quadro.getTamanhoLado());
        System.out.println("E a area desse quadrado é "+quadro.calcularArea());
        System.out.println("---------------------------------------------");

        quadro.setTamanhoLado(12);
        System.out.println("Agora o lado atual do quandrado equivale a "+quadro.getTamanhoLado());
        System.out.println("E a area desse quadrado é "+quadro.calcularArea());


    }
}
