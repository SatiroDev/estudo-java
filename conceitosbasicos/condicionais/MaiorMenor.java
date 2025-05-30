package conceitosbasicos.condicionais;

public class MaiorMenor{
    public static void main(String[] args) {
        double numero1 = 5.9;
        double numero2 = 690;

        if (numero1 > numero2) {
            System.out.printf("O número '%.2f' é maior que o número '%.2f'", numero1, numero2);
        }
        else if (numero1 < numero2) {
            System.out.printf("O número '%.2f' é menor que o número '%.2f'", numero1, numero2);
        }
        else {
            System.out.printf("Os números são iguais -> número 1: '%.2f' e número 2: '%.2f'", numero1, numero2);
        }
    }
    
}
