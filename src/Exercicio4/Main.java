package Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente=new ContaCorrente(1150,"Roberta",520);

        System.out.println("\n");
        System.out.println("O número da sua conta é: "+contaCorrente.getNumeroConta());
        System.out.println("O nome do Correntista é : "+contaCorrente.getNomeCorrentista());
        System.out.println("O seu saldo atual é : "+contaCorrente.getSaldo());
        System.out.println("-------------------------------------------------");

        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite 1 para depositar ou 2 para sacar:");
        int numero= entrada.nextInt();
        if (numero==1){
            System.out.println("Qual valor deseja depositar: ");
            double valor=entrada.nextInt();
            contaCorrente.setSaldo(contaCorrente.getSaldo()+valor);

            System.out.println("Você depositou: "+valor);
            System.out.println("Seu saldo atual é: "+contaCorrente.getSaldo());
        }
        else if (numero==2) {
            System.out.println("Qual valor deseja sacar: ");
            double valor=entrada.nextInt();
            contaCorrente.setSaldo(contaCorrente.getSaldo()-valor);

            System.out.println("Você sacou: "+valor);
            System.out.println("O saldo atual é: "+contaCorrente.getSaldo());
        }
        else {
            System.out.println("Opção inválida!!");
        }

    }
}
