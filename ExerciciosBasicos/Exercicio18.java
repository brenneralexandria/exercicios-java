package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numb = scan.nextInt();

        int a = 1;
        while (a <= numb) {
            System.out.println(a);
            a++;
        }
    }
}
