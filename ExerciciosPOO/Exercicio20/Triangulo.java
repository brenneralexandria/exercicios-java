package ExerciciosPOO.Exercicio20;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    //Construtor da classe
    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    //Getters and Setters

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double calcularArea() {
        return (this.ladoC * this.ladoB) / 2;
    }

    public double calcularPerimetro() {
        return this.ladoB + this.ladoC + this.ladoA;
    }
}