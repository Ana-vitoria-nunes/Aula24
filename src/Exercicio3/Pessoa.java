package Exercicio3;

public class Pessoa {
    private String nome;
    private double peso, altura;
    private int idade;

    public Pessoa(String nome1, int idade1, double peso1, double altura1) {
        this.nome = nome1;
        this.idade = idade1;
        this.peso = peso1;
        this.altura = altura1;
    }

    public void setIdade(int idade1) {
        this.idade = idade1;
    }

    public void setAltura(double altura1) {
        this.altura = altura1;
    }

    public String getNome() {
        return nome;

    }

    public double getPeso() {
        return peso;

    }
    public double getAltura() {
        return altura;

    }
    public int getIdade(){
        return idade;

    }
    //Métodos: Envelhecer, engordar, emagrecer, crescer.
    public int envelhecer(){
        return idade;
    }
    public double engordar(){
        return peso;
    }
    public double emagrecer(){
        return peso;
    }
    public double crescer(){
        return altura;
    }
}
