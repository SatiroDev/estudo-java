package ProgramaçãoOrientadaAObjetos;
import java.util.Scanner;
public class CadastroLivros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InformacoesLivro[] lista_livros = new InformacoesLivro[5];
        System.out.println("Cadastre até 5 livros!");
        String continuar;
        int indice = 0;
        do {
            InformacoesLivro livro = new InformacoesLivro();

            System.out.printf("Digite o título do livro: ");
            String titulo_livro = input.nextLine();
            livro.titulo = titulo_livro;

            System.out.printf("Digite o nome do autor(a) do livro: ");
            String nome_autor = input.nextLine();
            livro.autor = nome_autor;

            System.out.printf("Digite o ano de publicação do livro: ");
            int publicacao_ano = input.nextInt();
            livro.ano_publicacao = publicacao_ano;

            System.out.printf("Digite a quantidade de páginas que o livro tem: ");
            int quantidade_pags = input.nextInt();
            livro.numeros_paginas = quantidade_pags;

            lista_livros[indice] = livro;

            indice ++;

            input.nextLine();
            System.out.printf("Deseja cadastrar mais livros, escrava 's' ou 'n': ");
            continuar = input.nextLine();
        } while (!continuar.equalsIgnoreCase("n") && indice < lista_livros.length);

        System.out.printf("Digite um nome do livro para fazer umaa busca: ");
        String buscaTituloLivro = input.nextLine();
        boolean verificacao = false;
        for (InformacoesLivro livros: lista_livros) {
            if (livros.titulo != null && livros.titulo.equalsIgnoreCase(buscaTituloLivro)) {
                System.out.printf("Título do livro: %s%n", livros.titulo);
                System.out.printf("Autor do livro: %s%n", livros.autor);
                System.out.printf("Ano de publicação do livro: %d%n", livros.ano_publicacao);
                System.out.printf("Total de páginas do livro: %s%n", livros.numeros_paginas);
                verificacao = true;
                break;
            }
            break;
        }
        if (!verificacao) {
            System.out.printf("Livro '%s' não encontrado!", buscaTituloLivro);
        }
        input.close();
    }

}

class InformacoesLivro {
    String titulo;
    String autor;
    int ano_publicacao;
    int numeros_paginas;

}