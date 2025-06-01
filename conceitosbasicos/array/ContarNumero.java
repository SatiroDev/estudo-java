package conceitosbasicos.array;
import java.util.Scanner;
public class ContarNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {2, 4, 2, 7, 2, 9};
        System.out.println("Digite um número inteiro:");
        int escolha_numero = input.nextInt();
        int resp = contarNumero(escolha_numero, array);
        System.out.printf("O número %d aparece %d vezes na lista", escolha_numero, resp);
        input.close();
    }

    public static int contarNumero(int num_escolha, int[] numero) {
        int contagem = 0;
        for (int n: numero) {
            if (n == num_escolha) {
                contagem ++;
            }
        }
        return contagem;
    }
}
