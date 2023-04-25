package ExerciciosPOO.exercicio11;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Mais esperto que o diabo", "Napoleon Hill", 2011);

        System.out.println(livro.getTitulo() + ", " + livro.getAutor() + ", " + livro.getAno());
    }
}