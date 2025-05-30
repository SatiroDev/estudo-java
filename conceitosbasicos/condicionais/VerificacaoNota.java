package conceitosbasicos.condicionais;
import java.util.Scanner;

public class VerificacaoNota {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma nota:");
        double nota = input.nextDouble();
        if (nota > 6) {
            System.out.println("Aprovado!");
        }
        else if (nota == 6) {
            System.out.println("Recuperação!");
        }
        else {
            System.out.println("Reprovado!");
        }
        
        input.close();
    }
}
