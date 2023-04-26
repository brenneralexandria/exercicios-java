package ExerciciosPOO.Exercicio16;

public class Main {
    public static void main(String[] args) {

        Produto p = new Produto("Camisa", 99.90, 2);

        p.adicionarItem(4);


        p.removerItem(6);
        p.exibirEstoque();

        p.removerItem(6);
        p.exibirEstoque();
    }
}