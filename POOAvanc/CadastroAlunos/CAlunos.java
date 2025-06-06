package POOAvanc.CadastroAlunos;

public class CAlunos {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

    public CAlunos (String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota1() {
        if (nota1 >= 0 && nota1 <= 10) {
            return nota1;
        }
        else {
            return -1;
        }
    }

    public double getNota2() {
        if (nota2 >= 0 && nota2 <= 10) {
            return nota2;
        }
        else {
            return -1;
        }

    }

    public void setNota1(double novaNota1) {
        if (novaNota1 >= 0 && novaNota1 <= 10) {
            this.nota1 = novaNota1;
        }
        else {
            System.out.println("Nota inválida! Digite uma nota de 0 até 10!");
        }
    }

    public void setNota2(double novaNota2) {
        if (novaNota2 >= 0 && novaNota2 <= 10) {
            this.nota2 = novaNota2;
        }
        else {
            System.out.println("Nota inválida! Digite uma nota de 0 até 10!");
        }
    }

    public void exibirInformacoes() {
        if (getNota1() < 0 || getNota1() > 10 || getNota2() < 0 || getNota2() > 10) {
            System.out.println("Notas inválidas. Corrija antes de exibir as informações.");
            return;
        }
        else {
            System.out.println("Nome do aluno(a): " + getNome());
            System.out.println("Mátricula do aluno(a): " + getMatricula());
            System.out.println("Primeira nota do aluno(a): " + getNota1());
            System.out.println("Segunda nota do aluno(a): " + getNota2());
            double media = (getNota1() + getNota2()) / 2;
            System.out.println("Média do aluno(a): " + media);
            System.out.println();
        }

    }

    public void statusAluno() {
        if (getNota1() < 0 || getNota1() > 10 || getNota2() < 0 || getNota2() > 10) {
            System.out.println("Notas inválidas. Corrija antes de exibir as informações.");
            return;
        }
        else {
            double media = (getNota1() + getNota2()) / 2;
            if (media >= 6) {
                System.out.println("Aluno(a) aprovado!");
            } else {
                System.out.println("Aluno(a) reprovado!");
            }
            System.out.println();
        }
    }
}
