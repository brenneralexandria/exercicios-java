package ExerciciosPOO.Exercicio19;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("João", 30);

        paciente.adicionarHistorico("Consulta de rotina.");
        paciente.adicionarHistorico("Tratamento de gripe.");
        paciente.adicionarHistorico("Cirurgia de apendicite.");

        paciente.exibirHistorico();

        paciente.removerHistorico(1);

        paciente.exibirHistorico();
    }
}