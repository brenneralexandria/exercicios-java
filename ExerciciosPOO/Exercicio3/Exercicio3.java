package ExerciciosPOO.Exercicio3;

public class Exercicio3 {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria("Brenner", 1000000, 1108);

        System.out.println("titular: " + contaBancaria.getTitular());
        System.out.println("Conta: " + contaBancaria.getNumero());
        System.out.println("Saldo: " + contaBancaria.getSaldo());
    }
}
