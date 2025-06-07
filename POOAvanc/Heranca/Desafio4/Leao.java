package POOAvanc.Heranca.Desafio4;

public class Leao extends Animal{

    public Leao (String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("O leão roge: Roooar!");
        System.out.println();
    }
}
