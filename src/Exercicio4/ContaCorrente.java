package Exercicio4;
public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(int numeroConta1,String nomeCorrentista1,double saldo1){
        this.numeroConta = numeroConta1;
        this.nomeCorrentista = nomeCorrentista1;
        this.saldo = saldo1;
    }
    public void setSaldo(double saldo1) {

        this.saldo = saldo1;
    }
    public double getSaldo(){

        return saldo;
    }
    public int getNumeroConta(){

        return numeroConta;
    }
    public String getNomeCorrentista(){
        return nomeCorrentista;
    }
    public double depositoConta(){

        return saldo;
    }
}
