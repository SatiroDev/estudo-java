package POOAvanc.Heranca.Desafio2;

public class Reptil extends Animal {
    String tipoEscama;


    public void exibirDados() {
        System.out.println("--- REPTIL ---");
        super.exibirDados();
        System.out.println("Tipo de escama: " + tipoEscama);
        System.out.println();
    }
}
