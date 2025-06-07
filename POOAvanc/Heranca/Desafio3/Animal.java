package POOAvanc.Heranca.Desafio3;

public class Animal {
    String nome;

    public Animal (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }
}
