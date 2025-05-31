package conceitosbasicos.metodos;
import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua primeira nota:");
        double n1 = input.nextDouble();
        System.out.println("Digite sua segunda nota:");
        double n2 = input.nextDouble();
        System.out.println("Digite sua terceira nota:");
        double n3 = input.nextDouble();
        double media = calcularMedia(n1, n2, n3);
        if (media >= 7) {
            System.out.printf("Sua média foi: %.2f%nAPROVADO!", media);
        }
        else if (media >= 5 && media < 7) {
            System.out.printf("Sua média foi: %.2f%nRECUPERAÇÃO!", media);
        }
        else {
            System.out.printf("Sua média foi: %.2f%nREPROVADO!", media);
        }
        input.close();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }
}
