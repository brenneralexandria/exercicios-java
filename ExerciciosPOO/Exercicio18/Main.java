package ExerciciosPOO.Exercicio18;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 2500.0, "Analista de Sistemas");

        System.out.println("Salário antes do aumento: " + funcionario.getSalario());
        funcionario.aumentarSalario(10.0);
        System.out.println("Salário após aumento de 10%: " + funcionario.getSalario());

        System.out.println("Cargo antes da alteração: " + funcionario.getCargo());
        funcionario.alterarCargo("Desenvolvedor");
        System.out.println("Cargo após alteração: " + funcionario.getCargo());
    }
}