package POOAvanc.Heranca.Desafio5;

public class Tigre extends Animal{

    public Tigre(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("O tigre ruge!");
    }

    @Override
    public void alimentar() {
        super.alimentar();
        System.out.println("O tigre come carne crua.");
        System.out.println();
    }
}
