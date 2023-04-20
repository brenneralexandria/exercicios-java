package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos graus Celsius está fazendo ai no Brasil?: ");
        double grauCelsius = scan.nextDouble();

        double grauFahrenheit = (grauCelsius * 9 / 5) + 32;

        System.out.println("Legal, ai está fazendo " + grauCelsius + ", então aqui onde estou a temperatura" +
                " esta em Fahrenheit é de " + grauFahrenheit);

        scan.close();
    }
}
