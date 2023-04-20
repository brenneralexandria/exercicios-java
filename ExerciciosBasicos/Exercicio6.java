package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int NUMB = scan.nextInt();

        int numbAbsoluto = Math.abs(NUMB);

        System.out.println("O número absoluto de " + NUMB + " é " + numbAbsoluto);

        scan.close();
    }
}
