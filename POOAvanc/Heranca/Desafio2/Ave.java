package POOAvanc.Heranca.Desafio2;

public class Ave extends Animal {
    String corPena;

    public void exibirDados() {
        System.out.println("--- AVE ---");
        super.exibirDados();
        System.out.println("Cor das penas: " + corPena);
        System.out.println();
    }
}
