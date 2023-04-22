package ExerciciosMedios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = scan.nextInt();

        if(idade < 12) {
            System.out.println("Você é uma criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        }else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }
        scan.close();
    }
}
