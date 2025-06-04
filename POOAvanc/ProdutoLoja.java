package POOAvanc;

public class ProdutoLoja {
    public static void main(String[] args) {
        Produto produto = new Produto("Caneta azul", 2.50, 100);
        produto.exibirInformacoes();
        System.out.println("Total em estoque: " + produto.calcularValorTotalEmEstoque());

    }
}

