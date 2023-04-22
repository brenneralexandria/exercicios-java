package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numb = scan.nextInt();

        for (int i = 0; i < numb; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}