package ExerciciosPOO.Exercicio5;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distancia(Ponto outroPonto) {
        double difX = this.x - outroPonto.getX();
        double difY = this.y - outroPonto.getY();
        return Math.sqrt(difX * difX + difY * difY);
    }
}