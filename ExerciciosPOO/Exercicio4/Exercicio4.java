package ExerciciosPOO.Exercicio4;

public class Exercicio4 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Brenner", 1245, 10);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Nota: " + aluno.getNota());
    }
}