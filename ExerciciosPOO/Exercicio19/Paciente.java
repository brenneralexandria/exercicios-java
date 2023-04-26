package ExerciciosPOO.Exercicio19;

import java.util.ArrayList;

public class Paciente {
    private String nome;
    private int idade;
    private ArrayList<String> historicoMedico;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.historicoMedico = new ArrayList<String>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<String> getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(ArrayList<String> historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public void adicionarHistorico(String historico) {
        this.historicoMedico.add(historico);
    }
    public void removerHistorico(int index) {
        this.historicoMedico.remove(index);
    }

    public void exibirHistorico() {
        System.out.println("Histórico médico do paciente " + this.nome + ":");
        for (String historico : this.historicoMedico) {
            System.out.println(historico);
        }
    }
}