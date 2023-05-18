package Exercicio5;
public class Carro {
    private int quantPortas;
    private String modelo,marca;
    private double potencia;

    public Carro(int quantPortas1,String modelo1,String marca1, double potencia1){
        this.quantPortas=quantPortas1;
        this.modelo=modelo1;
        this.marca=marca1;
        this.potencia=potencia1;
    }
    public int getQuantPortas(){
        return quantPortas;
    }
    public String getModelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
    public double getPotencia(){
        return potencia;
    }
    public String ligarCarro(){
        return "Carro ligado com sucesso";
    }
}
