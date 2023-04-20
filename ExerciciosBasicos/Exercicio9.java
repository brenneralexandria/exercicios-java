package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int NUMB1 = scan.nextInt();
        System.out.print("Digite outro número: ");
        int NUMB2 = scan.nextInt();
        System.out.print("Digite mais um número: ");
        int NUMB3 = scan.nextInt();

        if(NUMB1 < NUMB2 && NUMB1 < NUMB3){
            System.out.println("O menor número é o: " + NUMB1);
        }else if(NUMB2 < NUMB1 && NUMB2 < NUMB3) {
            System.out.println("O menor número é o: " + NUMB2);
        }else if(NUMB3 < NUMB1 && NUMB3 < NUMB2) {
            System.out.println("O menor número é o: " + NUMB3);
        }else {
            System.out.println("Existem números iguais");
        }

        scan.close();
    }
}