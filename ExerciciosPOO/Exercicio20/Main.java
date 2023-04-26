package ExerciciosPOO.Exercicio20;

public class Main {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(4,4,4);

        System.out.println("Sua área: " + triangulo.calcularArea());
        System.out.println("Seu perímetro: " + triangulo.calcularPerimetro());

    }
}