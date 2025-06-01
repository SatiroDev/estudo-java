package conceitosbasicos.string;
import java.util.Scanner;
public class VerificarPalindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva algo:");
        String frase = input.nextLine();
        String frase_sem_espaco = frase.replace(" ", "");
        char[] resp = verificarPalindromo(frase_sem_espaco);
        String r = new String(resp);
        if (r.equals(frase_sem_espaco)) {
            System.out.printf("O que você escreveu '%s' é palindromo!", frase);
        }
        else {
            System.out.printf("O que você escreveu '%s' não é palindromo!", frase);
        }
        
        input.close();
    }

    public static char[] verificarPalindromo(String frase) {
        
        char[] frase_list = frase.toCharArray();
        char[] frase_inversa = new char[frase_list.length];
        int cont = 0;
        for (int i = frase_list.length - 1; i >= 0; i--) {
            frase_inversa[cont] = frase_list[i];
            cont ++;
        }
        return frase_inversa;

    }
}
