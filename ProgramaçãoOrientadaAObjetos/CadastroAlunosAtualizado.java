package ProgramaçãoOrientadaAObjetos;
import java.util.Scanner;
public class CadastroAlunosAtualizado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InfoAlunos[] alunos = new InfoAlunos[5];

        System.out.println("Cadastre até 5 alunos!");
        String continuacao;
        for (int i = 0; i <= 4; i ++) {
            InfoAlunos aluno = new InfoAlunos();

            System.out.println("Escreva o nome do aluno: ");
            String nome_aluno = input.nextLine();
            aluno.nome = nome_aluno;

            System.out.println("Digite a primeira nota do aluno:");
            double nota1_aluno = input.nextDouble();
            aluno.nota1 = nota1_aluno;

            System.out.println("Digite a segunda nota do aluno:");
            double nota2_aluno = input.nextDouble();
            aluno.nota2 = nota2_aluno;

            alunos[i] = aluno;

            System.out.println("Deseja adicionar mais alunos: digite 's' ou 'n'");
            continuacao = input.nextLine();

            if (continuacao.equalsIgnoreCase("n")) {
                break;
            }
        }
        for (InfoAlunos nome: alunos) {
            if (nome.nome != null) {
                System.out.println(nome.nome);
            }
        }
        input.close();
    }
}

class InfoAlunos {
    String nome;
    double nota1 = -1;
    double nota2 = -1;
}