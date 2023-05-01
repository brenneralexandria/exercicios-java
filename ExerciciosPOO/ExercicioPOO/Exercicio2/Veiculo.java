package ExerciciosPOO.ExercicioPOO.Exercicio2;

public abstract class Veiculo {

    //Atributos
    private String modelo;
    private int anoFabricacao;

    //Construtor
    public Veiculo(String modelo, int anoFabricacao){ this.modelo = modelo; this.anoFabricacao = anoFabricacao;}

    // Getters and setters
    public String getModelo() { return modelo; }

    public void setModelo(String modelo) { this.modelo = modelo;}

    public int getAnoFabricacao() { return anoFabricacao;}

    public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao; }

    //Métodos
    public abstract void ligar();
    public abstract void desligar();
}