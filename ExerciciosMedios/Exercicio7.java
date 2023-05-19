package ExerciciosMedios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase");
        String frase = scan.nextLine();

        // Contagem de letras
        int numeroletras = contarletras(frase);
        System.out.println("Número de letras na frase: " + numeroletras);

        // Contagem de caracteres sem espaços em branco
        int numeroCaracteres = contarCaracteres(frase);
        System.out.println("Número de caracteres na frase (sem espaços): " + numeroCaracteres);

        // Verificação de palíndromo
        boolean ePalindromo = verificarPalindromo(frase);
        if (ePalindromo) {
            System.out.println("A frase é um palíndromo.");
        } else {
            System.out.println("A frase não é um palíndromo.");
        }
    }

    private static int contarletras(String frase) {
        String[] letras = frase.split("\\s+");
        return letras.length;
    }

    private static int contarCaracteres(String frase) {
        return frase.replace(" ", "").length();
    }

    private static boolean verificarPalindromo(String frase) {
        String fraseSemEspacos = frase.replace(" ", "").toLowerCase();
        String fraseInvertida = new StringBuilder(fraseSemEspacos).reverse().toString();
        return fraseSemEspacos.equals(fraseInvertida);
    }
}