package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio da esfera para ser calculado o seu volume: ");
        int RAIO = scan.nextInt();

        double PI = 3.14;
        double VOLUME = (4.0/3.0) * PI * Math.pow(RAIO, 3);

        System.out.println("O valor do raio desejado é: " + VOLUME);
    }
}