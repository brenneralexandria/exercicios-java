package ExerciciosPOO.ExercicioPOO.Exercicio5;

public class Produto {

    private String name;
    private double preco;
    private int quantidade;

    public Produto(String name, double preco, int quantidade) {
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionar(int quantidade) {
        this.quantidade += quantidade;
    }

    public void remover(int quantidade) {
        if(this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        }else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}