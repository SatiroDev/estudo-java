public class GerenciadorFilmes {
    public static void main(String[] args) {
        Filme f = new Filme();
        f.titulo = "A Origem";
        f.diretor = "Christopher Nolan";
        f.ano_de_lancamento = 2010;
        f.duracao_em_minutos = 148;

        f.mostrarDetalhes();
        f.avaliar(8.5);
        f.avaliar(9.0);
        f.mostrarDetalhes();
        System.out.println(f.ehClassico());
        f.mostrarDetalhes();
        f.avaliar(7.5);
        f.avaliar(9.0);
        f.avaliar(8.0);
        f.mostrarDetalhes();
        System.out.println(f.ehClassico());

        f.avaliar(10.0);
        f.mostrarDetalhes();


    }
}

class Filme {
    String titulo;
    String diretor;
    int ano_de_lancamento;
    int duracao_em_minutos;
    double soma_avaliacoes = 0;
    double avaliacao_media = 0;
    int total_de_avaliacoes = 0;

    void avaliar(double nota) {
        if (nota >= 0 && nota <= 10) {
            total_de_avaliacoes ++;
            soma_avaliacoes += nota;
            avaliacao_media = soma_avaliacoes / total_de_avaliacoes;
        }
        else {
            System.out.println("Nota inválida! Aceitamos notas de 0 a 10!");
        }
    }
    void mostrarDetalhes() {
        System.out.printf("Título do filme: %s%n", titulo);
        System.out.printf("Diretor do filme: %s%n", diretor);
        System.out.printf("Ano de lançamento do filme: %d%n", ano_de_lancamento);
        System.out.printf("Duração em minutos do filme: %d%n",duracao_em_minutos);
        System.out.printf("Avaliação média do filme: %.2f%n", avaliacao_media);
        System.out.printf("Total de avaliações do filme: %d%n%n", total_de_avaliacoes);
    }

    boolean ehClassico() {
        return 2025 - ano_de_lancamento > 25;
    }
}
