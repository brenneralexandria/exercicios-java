package ExerciciosMedios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int N = scan.nextInt();

        int A = 0;
        int B = 1;

        for (int I = 2; I < N; I++) {
            int proximo = A + B;
            System.out.print(proximo + ", ");
            A = B;
            B = proximo;
        }

        scan.close();
    }
}