package ExerciciosPOO.ExercicioPOO.Exercicio3;

public class ContaCorrente extends Conta{

    private double limite;

    public ContaCorrente(int numero, String titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (this.getSaldo() + this.limite)) {
            double novoSaldo = this.getSaldo() - valor;
            if (novoSaldo >= 0) {
                this.setSaldo(novoSaldo);
                System.out.println("Saque no valor de R$" + valor + " realizado com sucesso!");
                System.out.println("Novo saldo: R$" + this.getSaldo());
            } else {
                double limiteUsado = valor - this.getSaldo();
                this.setSaldo(0.0);
                this.limite -= limiteUsado;
                System.out.println("Saque no valor de R$" + valor + " realizado com sucesso!");
                System.out.println("Novo saldo: R$" + this.getSaldo());
                System.out.println("Limite utilizado: R$" + limiteUsado);
                System.out.println("Novo limite disponível: R$" + this.limite);
            }
        } else {
            System.out.println("Saldo e limite insuficientes para realizar o saque.");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}