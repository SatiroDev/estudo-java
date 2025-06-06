package POOAvanc.CadastroAlunos;

public class CACadastrarAluno {
    public static void main(String[] args) {
        CAlunos aluno = new CAlunos("José Satiro", "20241321000014", 10, 8.1);
        aluno.exibirInformacoes();
        aluno.statusAluno();

        aluno.setNota1(-2);
        aluno.setNota2(9);
        aluno.exibirInformacoes();
        aluno.statusAluno();
    }
}
