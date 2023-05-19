package ExerciciosMedios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String str = scan.nextLine();

        Map<Character, Integer> contagem = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char letra = str.charAt(i);
            if (!contagem.containsKey(letra)) {
                contagem.put(letra, 1);
            } else {
                int contadorAtual = contagem.get(letra);
                contagem.put(letra, contadorAtual + 1);
            }
        }

        System.out.println("Contagem de letras: ");
        for (Map.Entry<Character, Integer> entry : contagem.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }

        scan.close();
    }
}