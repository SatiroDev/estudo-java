package condicionais;

public class ImparPar{
    public static void main(String[] args) {
        int numero = 4;
        if (numero % 2 == 0) {
            System.out.printf("O número '%d' é par!", numero);
        }
        else {
            System.out.printf("O número '%d' é impar!", numero);
        }
    }
    
}