package ProgramaçãoOrientadaAObjetos;
import java.util.Scanner;
import java.util.TreeMap;

public class DesafioProduto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto[] produto = new Produto[5];
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        p1.nome = "Feijão";
        p1.preco = 5.99;
        p1. quantidade = 3;


        p2.nome = "Arroz";
        p2.preco = 3.99;
        p2.quantidade = 3;

        p3.nome = "Macarrão";
        p3.preco = 3.50;
        p3.quantidade = 3;

        produto[0] = p1;
        produto[1] = p2;
        produto[2] = p3;

        System.out.println("Digite um nome de um produto para uma consulta:");
        String nome_produto = input.nextLine();
        boolean verificacao = false;
        for (Produto p: produto) {
            if (p != null && nome_produto.equalsIgnoreCase(p.nome)) {
                System.out.printf("Nome do produto: %s%n", p.nome);
                System.out.printf("Preço do produto: R$%.2f%n", p.preco);
                System.out.printf("Quantidade adicionada: %d%n", p.quantidade);
                verificacao = true;
                break;
            }
        }

        if (!verificacao) {
            System.out.printf("Produdo '%s' não encontrado!", nome_produto);
        }
        input.close();

    };


};

class Produto {
    String nome;
    double preco;
    int quantidade;



};