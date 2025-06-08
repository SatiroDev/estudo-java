package POOAvanc.Heranca.Desafio5;

public class Girafa extends Animal{
    public Girafa (String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("A girafa faz um som suave!");
    }

    @Override
    public void alimentar() {
        super.alimentar();
        System.out.println("A girafa come folhas altas.");
        System.out.println();
    }
}
