package POOAvanc.Heranca.Desafio5;

public class Pinguim extends Animal{

    public Pinguim (String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("O pinguim grasna!");
    }

    @Override
    public void alimentar() {
        super.alimentar();
        System.out.println("O pinguin come peixes.");
        System.out.println();
    }
}
