package POOAvanc.Heranca.Desafio3;

public class Gato extends Animal{

    public Gato (String nome) {
        super(nome);
    }
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Gato mia: Miau!");
        System.out.println();
    }
}
