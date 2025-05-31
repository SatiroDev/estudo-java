package conceitosbasicos.metodos;
import java.util.Scanner;
public class VerificarPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();
        if (verificarPrimo(num)) {
            System.out.printf("O número '%d' é primo", num);
        }
        else {
            System.out.printf("O número '%d' não é primo", num);
        }
    
    }
    public static boolean verificarPrimo(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i ++) {
            if (numero % i == 0) {
                contador += 1;
            }
        }
        return (contador == 2);
    }
}
