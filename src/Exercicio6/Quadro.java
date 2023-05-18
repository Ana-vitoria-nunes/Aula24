package Exercicio6;
public class Quadro {
    private double tamanhoLado;

    public Quadro(double tamanhoLado1){
        this.tamanhoLado=tamanhoLado1;
    }
    public void setTamanhoLado(double tamanhoLado1){
        this.tamanhoLado=tamanhoLado1;
    }
    public double getTamanhoLado(){
        return tamanhoLado;
    }
    public double calcularArea(){
        double area=tamanhoLado*tamanhoLado;
        return area;
    }
}
