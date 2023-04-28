package ExerciciosPOO.ExerciciosAbastracao.Exercicio3;

public abstract class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldoEmConta) {
        this.saldo = saldoEmConta;
    }

    public abstract void calcularJuros();

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}