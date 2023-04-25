package ExerciciosPOO.Exercicio3;

public class ContaBancaria {

    private String titular;
    private int saldo;
    private int numero;

    public ContaBancaria(String titular, int saldo, int numero) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}