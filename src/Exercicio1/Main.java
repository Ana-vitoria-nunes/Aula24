package Exercicio1;

import Exercicio1.Caixa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Caixa caixa=new Caixa(1000);
        Scanner entrada=new Scanner(System.in);
        System.out.println("Quantos lançamentos deseja fazer: ");
        double resposta= entrada.nextDouble();

        for (int i=0;i<resposta;i++){
            double resposta1;
            System.out.println("Se seu cartão for credito digite 1 / Se seu catão for debito digite 2: ");
            resposta1=entrada.nextDouble();

            if(resposta1==1){
                System.out.println("Qual valor deseja depositar: ");
                resposta1=entrada.nextDouble();

                caixa.setSaldo(caixa.getSaldo()+resposta1);
                System.out.println(caixa.getSaldo());

            }
            else if (resposta1==2) {
                System.out.println("Qual valor deseja sacar: ");
                resposta1 = entrada.nextDouble();

                caixa.setSaldo(caixa.getSaldo() - resposta1);
                System.out.println(caixa.getSaldo());
            }
            else {
                System.out.println("Opção inválida");
            }
        }
    }
}