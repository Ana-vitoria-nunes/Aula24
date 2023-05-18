package Exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro carro=new Carro(4,"Chevrolet S10","Chevrolet",2.0);
        System.out.println("Seu carro tem "+carro.getQuantPortas()+" portas.");
        System.out.println("O modelo do seu carro é "+carro.getModelo()+".");
        System.out.println("A marca do seu carro é "+carro.getMarca()+".");
        System.out.println("A potencia do seu carro é de "+carro.getPotencia()+".");
        System.out.println("---------------------------------------------------------");

        Scanner entada=new Scanner(System.in);
        System.out.println("Você deseja ligar o carro?\nDigite 1 para 'sim' ou 2 para 'não': ");
        int resposta=entada.nextInt();

        if(resposta==1){
            System.out.println(carro.ligarCarro());
        } else if (resposta==2) {
            System.out.println("Obrigado pela interação");

        }

    }
}
