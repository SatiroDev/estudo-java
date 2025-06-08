package POOAvanc.Heranca.Desafio5;

public class Animal {
    private String nome;
    private int idade;

    public Animal (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("O animal emite um som:");
    }

    public void alimentar() {
        System.out.println("O animal se alimenta:");
    }
}
