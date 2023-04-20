package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int NUMB = scan.nextInt();

        if(NUMB == 0){
            System.out.println("O número é zero");
        } else if (NUMB > 0) {
            System.out.println("O número é positivo");
        }else {
            System.out.println("O número é negativo");
        }

        scan.close();
    }
}
