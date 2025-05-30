package conceitosbasicos.estruturarepeticoes;
import java.util.Scanner;
public class Tabuada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número para ver sua tabuada: ");
        int numero = input.nextInt();
        int contador = 1;
        System.out.printf("Tabuada do %d:%n", numero);
        while(contador <= numero) {
            System.out.printf("%d x %d = %d%n", numero, contador, numero*contador);
            contador ++;
        }
    }
}
