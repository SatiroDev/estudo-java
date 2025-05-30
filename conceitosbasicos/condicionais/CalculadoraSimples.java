package conceitosbasicos.condicionais;
import java.util.Scanner;
public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero1 = input.nextDouble();

        System.out.println("Digite outro número:");
        double numero2 = input.nextDouble();

        System.out.println("Agora escolha uma operação [+, -, x, /]");
        String operacao = input.next();

        switch (operacao) {
            case "+":
                double soma = numero1 + numero2;
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, soma);                
                break;
            case "-":
                double subtracao = numero1 - numero2;
                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, subtracao); 
                break;
            case "x":
                double multiplicacao = numero1 * numero2;
                System.out.printf("%.2f x %.2f = %.2f", numero1, numero2, multiplicacao); 
                break;
            case "/":
                double divisao = numero1 / numero2;
                System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, divisao); 
                break;
            default:
                System.out.printf("Operação '%s' inválida!", operacao);
                break;
        }
        input.close();
    }
}