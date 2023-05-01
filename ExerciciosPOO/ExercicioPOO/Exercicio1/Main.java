package ExerciciosPOO.ExercicioPOO.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("bob", 1);
        Gato gato = new Gato("zig", 3);

        cachorro.emitirSom();
        cachorro.locomover();

        gato.emitirSom();
        gato.locomover();

        System.out.println(gato.getName());
    }
}