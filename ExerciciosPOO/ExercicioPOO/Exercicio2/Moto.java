package ExerciciosPOO.ExercicioPOO.Exercicio2;

public class Moto extends Veiculo{

    public Moto(String modelo, int anoFabricacao) {
        super(modelo, anoFabricacao);
    }

    @Override
    public void ligar() {
        System.out.println("Moto Ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Moto Desligada");
    }
}