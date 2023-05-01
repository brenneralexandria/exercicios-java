package ExerciciosPOO.ExercicioPOO.Exercicio4;

public class Professor extends Pessoa{

    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void trabalhar() {
        System.out.println("Você precisa ir ao trabalho hoje");
    }

    @Override
    public void descansar() {
        System.out.println("Hoje você está de folga");
    }
}
