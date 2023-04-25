package ExerciciosPOO.Exercicio7;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o valor da altura? ");
        double altura = scan.nextDouble();

        System.out.print("Qual o valor da largura? ");
        double largura = scan.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println("O valor da área do retângulo é: " + retangulo.calcularArea());
    }
}