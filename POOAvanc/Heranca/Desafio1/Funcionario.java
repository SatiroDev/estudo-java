package POOAvanc.Heranca.Desafio1;

public class Funcionario extends Pessoa{
    double salario;

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sálario: " + salario);
    }
}
