package POOAvanc.Heranca.Desafio4;

public class Elefante extends Animal{

    public Elefante (String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("O elefante trombeta: Pruuuu!");
        System.out.println();
    }
}
