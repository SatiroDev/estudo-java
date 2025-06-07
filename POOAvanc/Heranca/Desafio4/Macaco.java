package POOAvanc.Heranca.Desafio4;

public class Macaco extends Animal{

    public Macaco (String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("O macaco grita: Uuuh ahhh!");
        System.out.println();
    }
}
