package Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa=new Pessoa("Julia",18,65,1.65);
        Scanner entra=new Scanner(System.in);
        System.out.println("Você quer saber sua altura por quantos anos? ");
        int ano=entra.nextInt();

        for (int i=0;i<ano;i++){

            pessoa.getIdade();

            if (pessoa.getIdade()<20){

                pessoa.setAltura(pessoa.getAltura()+0.05);
                pessoa.setIdade(pessoa.getIdade()+1);
                System.out.println("Sua idade é "+pessoa.getIdade());
                System.out.println("E sua altura é: "+pessoa.getAltura());
                System.out.println("----------------------------------");
            }
            else {
                pessoa.setIdade(pessoa.getIdade()+1);
                System.out.println("Sua idade é "+pessoa.getIdade());
                System.out.println("Sua altura é: "+pessoa.getAltura());
                System.out.println("----------------------------------");
            }
        }

    }
}
