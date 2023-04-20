package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número desejado");
        int NUMB = scan.nextInt();

        if(NUMB % 2 == 0) {
            System.out.println("O número é par");
        }else {
            System.out.println("O número é impar");
        }
    }
}