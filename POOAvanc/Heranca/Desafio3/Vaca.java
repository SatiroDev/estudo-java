package POOAvanc.Heranca.Desafio3;

public class Vaca extends Animal{

    public Vaca (String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Vaca muge: Muuu!");
        System.out.println();
    }
}
