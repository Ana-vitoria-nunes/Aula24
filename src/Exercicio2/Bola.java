package Exercicio2;
public class Bola {
    private double circunferencia,velocidade;
    private String cor,marca,material;

    public Bola(double velocidade1,double circunferencia1, String cor1,String marca1, String material1){
        this.circunferencia=circunferencia1;
        this.velocidade=velocidade1;
        this.cor=cor1;
        this.marca=marca1;
        this.material=material1;
    }
    public void setCor(String cor1){
        this.cor=cor1;
    }
    public String getCor(){
        return cor;
    }
    public void setCircunferencia(double circunferencia1){
        this.circunferencia=circunferencia1;
    }
    public double getCircunferencia(){
        return circunferencia;
    }
    public void setVelocidade(double velocidade1){
        this.velocidade=velocidade1;
    }
    public double getVelocidade(){
        return velocidade;
    }
    public void setMarca(String marca1){
        this.marca=marca1;
    }
    public String getMarca(){
        return marca;
    }
    public void setMaterial(String material1){
        this.material=material1;
    }
    public String getMaterial(){
        return material;
    }
}
