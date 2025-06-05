package POOAvanc.CadastroAlunos;

public class CACadastrarAluno {
    public static void main(String[] args) {
        CAlunos aluno = new CAlunos("José Satiro", "20241321000014", 7.9, 8.1);
        aluno.exibirInformacoes();

        aluno.setNota1(7.1);
        aluno.setNota2(9);
        aluno.exibirInformacoes();
    }
}
