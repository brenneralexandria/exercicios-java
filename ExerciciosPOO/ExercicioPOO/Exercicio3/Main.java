package ExerciciosPOO.ExercicioPOO.Exercicio3;

    public class Main {
        public static void main(String[] args) {
            Conta conta = new Conta(123, "João");
            ContaCorrente contaCorrente = new ContaCorrente(456, "Maria", 100.0);

            conta.depositar(100.0);
            conta.sacar(50.0);
            System.out.println("-------------------------");

            contaCorrente.depositar(100.0);
            contaCorrente.sacar(50.0);
            contaCorrente.sacar(200.0);
            System.out.println("-------------------------");

            System.out.println("Saldo da conta: R$" + conta.getSaldo());
        }
    }