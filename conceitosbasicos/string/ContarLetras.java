package conceitosbasicos.string;
import java.util.Scanner;
public class ContarLetras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva uma frase:");
        String frase = input.nextLine();
        int resp = contarLetras(frase);
        System.out.printf("A frase '%s' possui %d letras", frase, resp);
        input.close();
    }

    public static int contarLetras(String frase) {
        String frase_sem_espaco;
        frase_sem_espaco = frase.replace(" ", "");
        int contagem = frase_sem_espaco.length();
        return contagem;
    }
}
