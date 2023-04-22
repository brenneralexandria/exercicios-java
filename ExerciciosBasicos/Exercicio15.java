package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numb = scan.nextInt();

        int soma = 0;
        for (int i = 1; i <= numb; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 1 a " + numb + " é " + soma);

        scan.close();
    }
}