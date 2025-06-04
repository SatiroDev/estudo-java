package ProgramaçãoOrientadaAObjetos;
import java.util.Scanner;
public class CadastroAlunosAtualizado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InfoAlunos[] alunos = new InfoAlunos[5];

        System.out.println("Cadastre até 5 alunos!");
        String continuacao;
        int ind = 0;
        do {
            InfoAlunos aluno = new InfoAlunos();

            System.out.println("Escreva o nome do aluno(a): ");
            String nome_aluno = input.nextLine();
            aluno.nome = nome_aluno;

            System.out.println("Digite a primeira nota do aluno(a):");
            double nota1_aluno = input.nextDouble();
            aluno.nota1 = nota1_aluno;

            System.out.println("Digite a segunda nota do aluno(a):");
            double nota2_aluno = input.nextDouble();
            aluno.nota2 = nota2_aluno;

            alunos[ind] = aluno;

            System.out.println("Deseja adicionar mais alunos: digite 's' ou 'n'");
            input.nextLine();
            continuacao = input.nextLine();
            ind ++;
        } while (!continuacao.equalsIgnoreCase("n") && ind < 5) ;

        System.out.println("Digite o nome de algum aluno(a):");
        String escolha_aluno = input.nextLine();

        boolean verificacao = false;
        for (InfoAlunos nomes: alunos) {
            if (nomes.nome != null && escolha_aluno.equalsIgnoreCase(nomes.nome)) {
                System.out.printf("Nome do aluno(a): %s%n", nomes.nome);
                System.out.printf("Primeira nota do aluno(a): %.2f%n", nomes.nota1);
                System.out.printf("Segunda nota do aluno(a): %.2f%n", nomes.nota2);
                double media = (nomes.nota1 + nomes.nota2) / 2;
                System.out.printf("Média do aluno(a): %.2f%n", media);
                if (media >= 6) {
                    System.out.println("Aluno(a) aprovado(a)!");
                }
                else {
                    System.out.println("Aluno(a) reprovado(a)!");
                }
                verificacao = true;
                break;
            }
            break;
        }

        if (!verificacao) {
            System.out.printf("Aluno(a) '%s' não encontrado!", escolha_aluno);
        }
        input.close();
    }
}

class InfoAlunos {
    String nome;
    double nota1 = -1;
    double nota2 = -1;
}