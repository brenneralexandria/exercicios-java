package ExerciciosBasicos;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, i, t, e;
        double a;

        System.out.println("Digite um número");
        x = scanner.nextInt();

        i = 0;
        t = 0;

        while (i < x) {
            System.out.println("Digite um número");
            e = scanner.nextInt();

            t = t + e;
            i = i + 1;
        }
        a = (double) t / x;

        System.out.println(i + " = " + a);
    }
}
