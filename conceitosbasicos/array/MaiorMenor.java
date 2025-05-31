package conceitosbasicos.array;
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] resp = lista(input);
        int maior_num = maior_numero(resp);
        System.out.printf("O maior número digitado foi foi %d", maior_num);
        input.close();
    
    }

    public static int[] lista(Scanner input) {
        System.out.println("Digite números inteiros:");
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d° número: ",i+1);
            int numero = input.nextInt();
            numeros[i] = numero;
        }
        return numeros;
    }

    public static int maior_numero(int[] lista) {
        int maior = 0;
        for (int n: lista) {
            if (n >= maior) {
                maior = n;
            }
        }
        return maior;
    }
}
