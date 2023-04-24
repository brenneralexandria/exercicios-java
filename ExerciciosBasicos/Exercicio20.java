package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numb = 5;

        int soma = 0;
        int i = 1;
        while (i <= numb) {
            soma += i;
            i++;
        }
            System.out.println(soma);

    }
}