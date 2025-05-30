package conceitosbasicos.condicionais;
import java.util.Scanner;
public class MenuOpcoes {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 10;
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Fazer depósito");
        System.out.println("3 - Fazer saque");
        System.out.println("4 - Sair");     
        System.out.println("Escolha uma opção: ");
        int escolha = input.nextInt();
        switch (escolha) {
            case 1:
                System.out.printf("Seu saldo R$%.2f",saldo);
                break;
            case 2:
                System.out.println("Digite a quantia que deseja para fazer o deposito: ");
                double deposito = input.nextDouble();
                saldo = saldo + deposito;
                System.out.printf("Saldo atualizado: R$%.2f", saldo);
                break;
            case 3:
                if (saldo <= 0) {
                    System.out.println("Você não tem saldo para poder fazer retirada");
                }
                else {
                    System.out.println("Digite a quantia no qual deseja retirar: ");
                    double saque = input.nextDouble();
                    saldo = saldo - saque;
                    System.out.printf("Saldo atualizado: R$%.2f", saldo);
                }
                break;
            case 4:
                System.out.println("Saindo...");
            default:
                break;
        }
        input.close();
    }
}