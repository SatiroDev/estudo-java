package POOAvanc.SistemaBiblioteca;

public class BibliotecaApp {
    public static void main(String[] args) {
        SBLivro livro1 = new SBLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 4);
        SBLivro livro2 = new SBLivro("Dom Casmurro", "Machado de Assis", 2);

        SBUsuario usuario = new SBUsuario("José satiro");

        usuario.emprestarLivro(livro1);
        usuario.emprestarLivro(livro2);

        usuario.exibirLivrosEmprestados();

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
    }
}
