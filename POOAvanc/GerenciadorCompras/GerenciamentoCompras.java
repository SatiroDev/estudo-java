package POOAvanc.GerenciadorCompras;

public class GerenciamentoCompras {
    public static void main(String[] args) {
        GCProduto produto = new GCProduto("Caderno", 15.5, 3);
        produto.exibirInformacoesProduto();

        GCProduto produto1 = new GCProduto("Borracha", 2, 5);
        produto1.exibirInformacoesProduto();

        GCCarrinho carrinho = new GCCarrinho();
        carrinho.adicionarProduto((produto));

        carrinho.adicionarProduto(produto1);

        carrinho.calcularValorTotal();

    }
}
