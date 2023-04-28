package ExerciciosPOO.ExerciciosAbastracao.Exercicio5;

public class Retangulo extends FiguraGeometrica{

    private final double base;
    private final double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}