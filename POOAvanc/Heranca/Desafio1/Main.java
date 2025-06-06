package POOAvanc.Heranca.Desafio1;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "José Satiro";
        professor.idade = 30;
        professor.salario = 4500;
        professor.disciplina = "Matemática";

        professor.exibirDados();

    }
}
