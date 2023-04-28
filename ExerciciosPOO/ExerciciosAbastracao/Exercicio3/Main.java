package ExerciciosPOO.ExerciciosAbastracao.Exercicio3;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000);

        contaCorrente.depositar(1000);
        System.out.println(contaCorrente.getSaldo());

        contaCorrente.calcularJuros();
        System.out.println(contaCorrente.getSaldo());
    }
}