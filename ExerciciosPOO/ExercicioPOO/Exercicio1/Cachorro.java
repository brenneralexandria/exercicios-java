package ExerciciosPOO.ExercicioPOO.Exercicio1;

public class Cachorro extends Animal{

    public Cachorro(String idade, int nome) {
        super(idade, nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("au au au");
    }

    @Override
    public void locomover() {
        System.out.println("tic tic tic tic ");
    }
}