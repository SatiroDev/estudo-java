package POOAvanc.Heranca.Desafio1;

public class Funcionario extends Pessoa{
    double salario;

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Sálario: " + salario);
    }
}
