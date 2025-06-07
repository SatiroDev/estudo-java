package POOAvanc.Heranca.Desafio3;

public class Cachorro extends Animal{

    public Cachorro (String nome) {
        super(nome);
    }
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Cachorro late: Au Au!");
        System.out.println();
    }
}
