package ExerciciosPOO.Exercicio5;

public class Exercicio5 {
    public static void main(String[] args) {

        Ponto p1 = new Ponto(1, 2);
        Ponto p2 = new Ponto(4, 6);

        double distancia = p1.distancia(p2);

        System.out.println("A distância entre os pontos é: " + distancia);

    }
}
