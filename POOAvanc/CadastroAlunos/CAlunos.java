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
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota1(double novaNota1) {
        this.nota1 = novaNota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do aluno(a): " + getNome());
        System.out.println("Mátricula do aluno(a): " + getMatricula());
        System.out.println("Primeira nota do aluno(a): " + getNota1());
        System.out.println("Segunda nota do aluno(a): " + getNota2());
        double media = (getNota1() + getNota2()) / 2;
        System.out.println("Média do aluno(a): " + media);
        System.out.println();
    }
}
