package conceitosbasicos.estruturarepeticoes;
import java.util.Scanner;
public class ContadorParesImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        System.out.println("Digite 10 números: ");
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Número %d: ",i);
            int numero = input.nextInt();
            if (numero % 2 == 0) {
                pares += 1;
            }
            else {
                impares += 1;
            }
        }
        System.out.printf("Total de pares: %d%n", pares);
        System.out.printf("Total de ímpares: %d", impares);
        input.close();
    }
}
