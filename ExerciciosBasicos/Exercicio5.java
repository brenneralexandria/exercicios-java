package ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a sua idade? ");
        int NUMB = scan.nextInt();

        if(NUMB < 18){
            System.out.println("Você é menor de idade");
        }else {
            System.out.println("Você é maior de idade");
        }
    }
}
