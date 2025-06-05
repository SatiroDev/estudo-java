package POOAvanc.SistemaBiblioteca;

public class SBLivro {
    private String titulo;
    private String autor;
    private int quantidadeDisponivel;

    public SBLivro (String titulo, String autor, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public void exibirInformacoes() {
        System.out.println("Informações sobre o livro:");
        System.out.println("Título do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
        System.out.println("Quantidade de livros disponíveis: " + quantidadeDisponivel);
        System.out.println();
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setQuantidadeDisponivel(int quantidade) {
        this.quantidadeDisponivel = quantidade;
    }
}
