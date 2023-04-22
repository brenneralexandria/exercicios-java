package ExerciciosMedios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o seu peso?");
        double peso = scan.nextDouble();
        System.out.print("Qual a sua altura?");
        double altura = scan.nextDouble();

        double imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("O seu imc é: " + imc + ", você está abaixo do peso");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("O seu imc é: " + imc + ", você está com o peso normal");
        } else {
            System.out.println("O seu imc é: " + imc + ", você está acima do peso");
        }
        scan.close();
    }
}
