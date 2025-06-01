package conceitosbasicos.string;
import java.util.Scanner;
public class PalavrasProibidas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva algo:");
        String frase = input.nextLine();
        
        String resp = SubstituirPalavrasProibidas(frase);
        System.out.println(resp);
        input.close();
    }
    public static String SubstituirPalavrasProibidas(String frase) {
        String[] frase_lista = frase.split("");
         for (String palavra: frase_lista) {
            if (palavra.equalsIgnoreCase("chato")) {
                frase = frase.replaceAll("chato", "*****");
            }
            else if (palavra.equalsIgnoreCase("estranho")) {
                frase = frase.replaceAll("estranho", "********");
            }
        }
        return frase;
    }
}
