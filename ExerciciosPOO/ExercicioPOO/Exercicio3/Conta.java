package ExerciciosPOO.ExercicioPOO.Exercicio3;

public class Conta {

    private int numero;
    private double saldo;
    private String titular;

    public Conta(int numero, String titular){
        this.numero = numero;
        this.saldo = 0.0;
        this.titular = titular;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito no valor de R$" + valor + " realizado com sucesso!");
        System.out.println("Novo saldo: R$" + this.saldo);
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque no valor de R$" + valor + " realizado com sucesso!");
            System.out.println("Novo saldo: R$" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}