package ExerciciosPOO.Exercicio12;

import ExerciciosPOO.exercicio11.Livro;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Air", "Ben Affleck", 2023);

        System.out.println(filme.getTitulo() + ", " + filme.getDiretor() + ", " + filme.getAno());
    }
}