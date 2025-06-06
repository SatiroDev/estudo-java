package POOAvanc.Heranca.Desafio1;

public class Professor extends Funcionario{
    String disciplina;

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina);
    }
}
