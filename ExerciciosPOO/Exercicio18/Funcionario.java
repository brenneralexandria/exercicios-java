package ExerciciosPOO.Exercicio18;

public class Funcionario {

    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * percentual / 100.0;
    }

    public void alterarCargo(String novoCargo) {
        this.cargo = novoCargo;
    }
}