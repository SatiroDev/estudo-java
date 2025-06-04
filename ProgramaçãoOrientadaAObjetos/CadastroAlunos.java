package ProgramaçãoOrientadaAObjetos;
import java.util.Scanner;
public class CadastroAlunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno[] alunos = new Aluno[10];

        Aluno aluno1 = new Aluno();

        aluno1.nome = "José Satiro";
        aluno1.nota1 = 7.7;
        aluno1.nota2 = 9.5;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Rayssa Mirella";
        aluno2.nota1 = 8.6;
        aluno2.nota2 = 6.5;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "João Cravo";
        aluno3.nota1 = 7.4;
        aluno3.nota2 = 8.3;

        alunos[0] = aluno1;
        alunos[1] = aluno2;
        alunos[2] = aluno3;

        System.out.printf("Escreva o nome de algum aluno: ");
        String BuscaAluno = input.nextLine();

        boolean verificacao = false;
        for (Aluno info_aluno: alunos) {
            if (info_aluno != null && BuscaAluno.equalsIgnoreCase(info_aluno.nome)) {
                System.out.printf("Nome do aluno: %s%n", info_aluno.nome);
                System.out.printf("Primeira nota: %.2f%n", info_aluno.nota1);
                System.out.printf("Segunda nota: %.2f%n", info_aluno.nota2);
                double media = (info_aluno.nota1 + info_aluno.nota2) / 2;
                System.out.printf("Média do aluno: %.2f%n", media);
                if (media >= 6) {
                    System.out.println("O aluno foi aprovado!");
                }
                else {
                    System.out.println("O aluno foi reprovado!");
                }
                verificacao = true;
            }
        }

        if (!verificacao) {
            System.out.printf("Aluno '%s' não encontrado!", BuscaAluno);
        }

        input.close();
    }
};

class Aluno {
    String nome;
    double nota1;
    double nota2;
}