package ExerciciosPOO.Exercicio8;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual é o valor da base? ");
        double base = scan.nextDouble();
        System.out.print("Qual o valor da altura? ");
        double altura = scan.nextDouble();

        Triangulo triangulo = new Triangulo(base, altura);

        System.out.print("O valor dá área do triângulo é: " + triangulo.calcularArea());
    }
}
