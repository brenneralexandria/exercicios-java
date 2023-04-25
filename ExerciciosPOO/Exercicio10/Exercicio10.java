package ExerciciosPOO.Exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o nome do funcionario? ");
        String nome = scan.nextLine();
        System.out.print("Qual o salário do funcionario? ");
        double salario = scan.nextDouble();
        System.out.print("Qual o cargo do funcionario? ");
        String cargo = scan.next();

        Funcionario funcionario = new Funcionario(nome,salario,cargo);

        System.out.println("funcionário cadastro com sucesso " +
                "Nome: " + funcionario.getNome() + ", " +
                "Cargo: " + funcionario.getCargo() + ", " +
                "Salário: " + funcionario.getSalario() + ". ");
    }
}