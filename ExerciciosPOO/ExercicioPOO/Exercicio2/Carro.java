package ExerciciosPOO.ExercicioPOO.Exercicio2;

public class Carro extends Veiculo{

    public Carro(String modelo, int anoFabricacao) {
        super(modelo, anoFabricacao);
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Carro Desligado");
    }
}