package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Bola bola=new Bola(30,54,"Azul","Adidas","Borracha");

        System.out.println("A circuferencia da bola é "+ bola.getCircunferencia());
        System.out.println("A bola chega a uma velocidade de  "+ bola.getVelocidade()+" km");
        System.out.println("A cor da bola é "+ bola.getCor());
        System.out.println("A marca da bola é "+ bola.getMarca());
        System.out.println("O material da bola é "+ bola.getMaterial());

        bola.setCor("Vermelho");
        System.out.println("\n------------------------------------------");
        System.out.println("A circuferencia da bola é "+ bola.getCircunferencia());
        System.out.println("A bola chega a uma velocidade de  "+ bola.getVelocidade()+" km");
        System.out.println("A cor da bola é "+ bola.getCor());
        System.out.println("A marca da bola é "+ bola.getMarca());
        System.out.println("O material da bola é "+ bola.getMaterial());


    }
}
