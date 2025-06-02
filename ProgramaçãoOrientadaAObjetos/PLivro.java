package ProgramaçãoOrientadaAObjetos;

public class PLivro {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.titulo = "Dom Casmusso";
        l.autor = "Machado de Assis";
        l.quantidade_de_paginas = 256;
        l.pagina_atual = 1;

        l.mostrarDetalhesLivro();
        l.avancarPagina();
        l.mostrarDetalhesLivro();
        l.voltarPagina();
        l.mostrarDetalhesLivro();

    }
}

class Livro {
    String titulo;
    String autor;
    int quantidade_de_paginas;
    int pagina_atual;

    void avancarPagina() {
        if (pagina_atual < quantidade_de_paginas) {
            pagina_atual ++;
        }
        else {
            System.out.println("Você ja chegou no fim do livro! Não tem mais páginas para avançar!");
        }
    }

    void voltarPagina() {
        if (pagina_atual > 1) {
            pagina_atual --;
        }
        else {
            System.out.println("Você está na primeira página do livro! Não tem páaginas para voltar!");
        }
    }

    void mostrarDetalhesLivro() {
        System.out.println("Detalhes:");
        System.out.printf("Título do livro: %s%n", titulo);
        System.out.printf("Autor do livro: %s%n", autor);
        System.out.printf("Total de páginas: %d%n", quantidade_de_paginas);
        System.out.printf("Página atual: %d%n%n", pagina_atual);
        
    }
}