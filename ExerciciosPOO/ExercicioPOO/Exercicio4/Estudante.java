package ExerciciosPOO.ExercicioPOO.Exercicio4;

public class Estudante extends Pessoa {

    public Estudante(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void trabalhar() {
        System.out.println("Você precisa ir a aula hoje e trabalhar duro");
    }

    @Override
    public void descansar() {
        System.out.println("Hoje você está de folga");
    }

}