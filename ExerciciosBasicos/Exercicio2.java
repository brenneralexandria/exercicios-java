package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int NUMB1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int NUMB2 = scan.nextInt();

        int SOMA = NUMB1 + NUMB2;

        System.out.println("A soma dos números que você digitou é: " + SOMA);
    }
}
