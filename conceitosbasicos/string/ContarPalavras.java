package conceitosbasicos.string;
import java.util.Scanner;
public class ContarPalavras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva uma frase:");
        String frase = input.nextLine();
        int resp = contarPalavras(frase);
        System.out.printf("A frase '%s' possui %d palavras", frase, resp);
        input.close();
    }
    public static int contarPalavras(String frase) {
        String[] frase_lista = frase.split(" ");
        int quantidade_palavras = 0;
        for (String palavra: frase_lista) {
            if (palavra.equals("")) {
            }
            else {
                quantidade_palavras ++;
            }
            
        }
        return quantidade_palavras;
    }
}
