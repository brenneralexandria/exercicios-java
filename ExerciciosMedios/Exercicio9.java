package ExerciciosMedios;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        // Definir o tabuleiro de letras
        char[][] tabuleiro = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'},
                {'q', 'r', 's', 't'}
        };

        // Ler a letra fornecida pelo usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = scanner.nextLine();

        // Verificar se a letra está presente no tabuleiro
        boolean encontrada = false;
        while (!encontrada) {
            encontrada = verificarLetra(tabuleiro, letra);

            if (!encontrada) {
                System.out.println("A letra não foi encontrada no tabuleiro. Tente novamente.");
                System.out.print("Digite uma letra: ");
                letra = scanner.nextLine();
            }
        }

        // Exibir o resultado
        System.out.println("A letra foi encontrada no tabuleiro.");
    }

    // Método para verificar se a letra está presente no tabuleiro
    public static boolean verificarLetra(char[][] tabuleiro, String letra) {
        int linhas = tabuleiro.length;
        int colunas = tabuleiro[0].length;

        // Verificar em todas as posições do tabuleiro
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (tabuleiro[i][j] == letra.charAt(0)) {
                    return true;
                }
            }
        }

        // Se a letra não foi encontrada, retornar false
        return false;
    }
}