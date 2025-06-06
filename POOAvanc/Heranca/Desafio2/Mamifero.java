package POOAvanc.Heranca.Desafio2;

public class Mamifero extends Animal{
    String tipoPelo;

    public void exibirDados () {
        System.out.println("--- MAMÍFERO ---");
        super.exibirDados();
        System.out.println("Tipo de pelo: " + tipoPelo);
        System.out.println();
    }
}
