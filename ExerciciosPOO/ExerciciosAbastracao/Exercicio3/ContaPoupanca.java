package ExerciciosPOO.ExerciciosAbastracao.Exercicio3;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldoEmConta) {
        super(saldoEmConta);
    }

    @Override
    public void calcularJuros() {
        double juros = saldo * 0.05;
        saldo += juros;
    }
}