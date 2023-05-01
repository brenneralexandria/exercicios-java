package ExerciciosPOO.ExercicioPOO.Exercicio5;

import java.time.LocalDate;

class ProdutoPerecivel extends Produto {
    protected LocalDate dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, LocalDate dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public void adicionar(int quantidade) {
        if (dataValidade.isBefore(LocalDate.now())) {
            System.out.println("Produto vencido, não pode ser adicionado ao estoque.");
        } else {
            super.adicionar(quantidade);
        }
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }
}