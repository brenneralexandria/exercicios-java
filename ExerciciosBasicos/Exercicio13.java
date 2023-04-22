package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numb = scan.nextInt();

        for (int i = 1; i <= numb; i++) {
            System.out.println(i);
        }
        scan.close();
    }
}
