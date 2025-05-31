package conceitosbasicos.estruturarepeticoes;
import java.util.Scanner;
public class SomaNDigs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");

        int numero = 0;
        do {
            numero = input.nextInt();
            if (numero <= 0) {
                System.out.println("O número tem que ser maior que 0!");
            }
            else {
                int soma = 0;
                int contador = 1;
                while (contador <= numero) {
                    soma += contador;
                    contador ++;
                }
                System.out.printf("A soma de 1 até %d é: %d", numero, soma);
            }
        } while(numero <= 0);
        input.close();
    }
}
