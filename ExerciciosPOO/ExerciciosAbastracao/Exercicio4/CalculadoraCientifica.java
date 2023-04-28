package ExerciciosPOO.ExerciciosAbastracao.Exercicio4;

public class CalculadoraCientifica implements Calculadora{

    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        return a / b;
    }

    public double raizQuadrada(double a) {
        return Math.sqrt(a);
    }

    public double logaritmo(double a) {
        return Math.log(a);
    }
}