package conceitosbasicos.string;
import java.util.Scanner;
public class PalavrasProibidas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva algo:");
        String frase = input.nextLine();
        System.out.println("Saída com censura:");
        String resp = SubstituirPalavrasProibidas(frase);
        System.out.println(resp);
        input.close();
    }
    public static String SubstituirPalavrasProibidas(String frase) {
        frase = frase.replaceAll("(?i)\\bchato+\\b", "*****");
        frase = frase.replaceAll("(?i)\\bestranho+\\b", "*****");
        return frase;
    }
}
