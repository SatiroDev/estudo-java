package conceitosbasicos.estruturarepeticoes;
import java.util.Scanner;
public class Contador {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int numero = input.nextInt();
        if (numero <= 0) {
            System.out.println("O número tinha que ser maior que 0!");
        }
        else {
            System.out.println("Contagem:");
            for (int i = 1; i <= numero; i++) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
