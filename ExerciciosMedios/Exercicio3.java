package ExerciciosMedios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite a sua nota: ");
        double nota = scan.nextDouble();

        if(nota >= 6) {
            System.out.println("Você passou caraio, PARABÉNS!!!");
        }else {
            System.out.println("Vai repetir, deu ruim parça!!!");
        }
        scan.close();
    }
}
