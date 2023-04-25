package ExerciciosPOO.Exercicio6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual é o raio? ");
        double resultadoRaio = scan.nextDouble();

        Circulo circulo = new Circulo(resultadoRaio);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("A área do seu círculo é: " + df.format(circulo.calcularArea()));
    }
}
