package ExerciciosPOO.ExerciciosAbastracao.Exercicio3;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldoEmConta) {
        super(saldoEmConta);
    }

    @Override
    public void calcularJuros() {
        double juros = saldo * 0.05;
        saldo += juros;
    }
}