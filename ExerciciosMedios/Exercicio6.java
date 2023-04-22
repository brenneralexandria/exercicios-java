package ExerciciosMedios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = scan.nextDouble();

        if(temperatura < 10) {
            System.out.println("Hoje a temperatura está em " + temperatura + "°C, e está frio");
        } else if (temperatura >= 10 && temperatura <= 25) {
        System.out.println("Hoje a temperatura está em " + temperatura + "°C, e está agradável");
        } else {
        System.out.println("Hoje a temperatura está em " + temperatura + "°C, e está quente");
        }
        scan.close();
    }
}