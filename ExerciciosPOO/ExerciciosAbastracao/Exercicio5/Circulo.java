package ExerciciosPOO.ExerciciosAbastracao.Exercicio5;

public class Circulo extends FiguraGeometrica {
    private final double raio;
    private final double PI = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * raio;
    }
}