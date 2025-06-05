package POOAvanc.SistemaBiblioteca;

public class SBUsuario {
    private String nome;
    private SBLivro[] livrosEmprestados = new SBLivro[3];
    private int indice = 0;

    public SBUsuario (String nome) {
        this.nome = nome;
    }

    public void emprestarLivro(SBLivro livro) {
        if (livro.getQuantidadeDisponivel() > 0 && indice < 3) {
            livrosEmprestados[indice] = livro;
            livro.setQuantidadeDisponivel(livro.getQuantidadeDisponivel() - 1);
            indice ++;
        }
        else {
            System.out.println("Erro! Quantidade de livro indisponivel ou você atingiu o limite de livros emprestado");
        }
    }

    public void exibirLivrosEmprestados() {
        System.out.println("Livros emprestados:");
        for (SBLivro livro: livrosEmprestados) {
            if (livro != null) {
                System.out.println("Titulo: " + livro.getTitulo());
            }
        }
        System.out.println();
    }
}
