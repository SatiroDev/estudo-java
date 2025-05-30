package conceitosbasicos.condicionais;
import java.util.Scanner;

public class FaixaEtaria {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        if (idade < 12) {
            System.out.println("Criança");
        }
        else if (idade >= 12 && idade <= 17) {
            System.out.println("Adolescente");
        }
        else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        }
        else {
            System.out.println("Idoso");
        }
        input.close();
    }
}
