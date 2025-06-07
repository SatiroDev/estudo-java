package POOAvanc.Heranca.Desafio3;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Tufão");
        cachorro.emitirSom();

        Gato gato = new Gato("Xexeu");
        gato.emitirSom();

        Vaca vaca = new Vaca("Mimoza");
        vaca.emitirSom();
    }
}
