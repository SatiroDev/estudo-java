package conceitosbasicos.metodos;

public class Fatorial {
    public static void main(String[] args) {
        int num = 10;
        int resp = fatorial(num);
        System.out.printf("O fatorial do número '%d' é '%d'",num, resp);
    }
    public static int fatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i ++) {
            fatorial *= i;
        }
        return fatorial;
    }
}

// int tem o limite funciona apenas ate o fatorial de 12!