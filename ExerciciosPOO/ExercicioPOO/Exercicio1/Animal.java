package ExerciciosPOO.ExercicioPOO.Exercicio1;

public abstract class Animal {
    private String name;
    private int idade;

    public Animal(String nome, int idade) {
        this.name = nome;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public abstract void emitirSom();
    public abstract void locomover();
}