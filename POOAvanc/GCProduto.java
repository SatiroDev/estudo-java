package POOAvanc;

public class GCProduto {
     String nome;
     double preco;
     int estoque;

    public GCProduto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void exibirInformacoesProduto () {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + estoque);
    }
}
