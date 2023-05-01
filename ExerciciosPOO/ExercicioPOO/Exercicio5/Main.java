package ExerciciosPOO.ExercicioPOO.Exercicio5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*Produto produto = new Produto("chocolate", 14.00, 2);

        produto.adicionar(2);

        produto.remover(5);
        System.out.println(produto.getQuantidade()); */

        LocalDate dataValidade = LocalDate.of(2023, 6, 1);
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite", 3.5, 20, dataValidade);

        System.out.println("Produto: " + produtoPerecivel.getName());
        System.out.println("Preço: R$" + produtoPerecivel.getPreco());
        System.out.println("Quantidade em estoque: " + produtoPerecivel.getQuantidade());
        System.out.println("Data de validade: " + produtoPerecivel.getDataValidade());

        LocalDate dataVencida = LocalDate.of(2021, 1, 1);
        ProdutoPerecivel produtoVencido = new ProdutoPerecivel("Iogurte", 2.0, 10, dataVencida);
        produtoVencido.adicionar(5);
    }

    }