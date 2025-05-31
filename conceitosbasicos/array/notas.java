package conceitosbasicos.array;
import java.util.Scanner;
public class notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] resp = add_notas(0);

        int quantidade = resp.length;
        System.out.println("Notas adicionadas:");
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Nota %d: %.2f%n", i+1, resp[i]);
        }
        System.out.println();
        System.out.printf("Média: %.2f", media(resp));
        input.close();
    }

    public static double[] add_notas(double entrada){
        double[] notas_aluno = new double[5]; 
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite a %d° nota: ", i+1);
            double nota = input.nextDouble();
            notas_aluno[i] = nota;
        }
        System.out.println();
        return notas_aluno;
    }

    public static double media(double[] notas) {
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        return media;
    }
        
}
