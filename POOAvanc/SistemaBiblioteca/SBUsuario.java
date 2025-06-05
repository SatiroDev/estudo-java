package POOAvanc.SistemaBiblioteca;

public class SBUsuario {
    private String nome;
    private SBLivro[] livrosEmprestados = new SBLivro[3];
    private int quantidade_livros = 0;
    private int indice = 0;

    public SBUsuario (String nome) {
        this.nome = nome;
    }

    public void emprestarLivro(SBLivro livro) {
        if (livro.getQuantidadeDisponivel() > 0 && quantidade_livros < 3) {
            livrosEmprestados[indice] = livro;
            livro.setQuantidadeDisponivel(livro.getQuantidadeDisponivel() - 1);
            indice ++;
        }
    }

    public void exibirLivrosEmprestados() {
        int cont = 0;
        for (SBLivro livro: livrosEmprestados) {
            if (livro != null) {
                if (cont == 0) {
                    System.out.println("Livros emprestados:");
                    cont ++;
                }
                System.out.println("Titulo: " + livro.getTitulo());
            }
        }
        System.out.println();
    }
}
