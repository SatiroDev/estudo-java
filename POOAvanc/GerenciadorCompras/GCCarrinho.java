package POOAvanc.GerenciadorCompras;

public class GCCarrinho {
    private GCProduto[] produtos = new GCProduto[200];
    private int indice = 0;
    private double valorTotal = 0;

    public GCCarrinho() {

    }

    public void adicionarProduto (GCProduto produto) {
        if (indice < produtos.length) {
            this.produtos[indice] = produto;
            indice ++;
        }
        else {
            System.out.println("Carrinho cheio!");
        }
    }

    public void calcularValorTotal () {
        for (GCProduto produto: produtos) {
            if (produto != null) {
                double total = produto.preco * produto.estoque;
                valorTotal += total;
            }
            else {
                System.out.println("Valor total: " + valorTotal);
                break;
            }

        }

    }

    public void exibirProdutos () {
        int cont = 0;
        for (GCProduto produto: produtos) {
            if (cont < indice) {
                System.out.println("Produto: " + produto.nome);
                System.out.println("Preço: " + produto.preco);
                System.out.println("Quantidade em estoque: " + produto.estoque);
                cont ++;
            }
            else {
                return;
            }
        }

    }
}
