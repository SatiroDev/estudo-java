package POOAvanc.Heranca.Desafio1;

public class Professor extends Funcionario{
    String disciplina;

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sálario: " + salario);
        System.out.println("Disciplina: " + disciplina);
    }
}
