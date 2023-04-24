package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        int numb = scan.nextInt();

        int i = 0;
        while (i <= numb) {
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
