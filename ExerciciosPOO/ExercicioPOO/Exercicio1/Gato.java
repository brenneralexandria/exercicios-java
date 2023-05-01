package ExerciciosPOO.ExercicioPOO.Exercicio1;

public class Gato extends Animal{

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miow");
    }

    @Override
    public void locomover() {
        System.out.println("puf puf puf");
    }
}