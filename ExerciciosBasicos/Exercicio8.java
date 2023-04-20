package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int NUMB1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int NUMB2 = scan.nextInt();

        if(NUMB1 > NUMB2) {
            System.out.println("O maior número é o: " + NUMB1);
        }else {
            System.out.println("O maior número é o: " + NUMB2);
        }

        scan.close();
    }
}
