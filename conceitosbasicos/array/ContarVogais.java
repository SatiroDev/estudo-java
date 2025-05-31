package conceitosbasicos.array;

public class ContarVogais {
    public static void main(String[] args) {
        String frase = "OlÁ múndo".toLowerCase();
        char[] letras = frase.toCharArray();
        int contagem = 0;
        for (char letra: letras) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'á' || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú' || letra == 'ã' || letra == 'õ' || letra == 'â' || letra == 'ê' || letra == 'à' || letra == 'è' || letra == 'ì' || letra == 'ò' || letra == 'ù') {
                contagem += 1;
            }
        }
        System.out.printf("Total de vogais: %d", contagem);
    }
}
