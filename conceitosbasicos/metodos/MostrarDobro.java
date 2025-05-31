package conceitosbasicos.metodos;

public class MostrarDobro {
    public static void main(String[] args) {
        mostrarDobro(10);
    }
    public static void mostrarDobro(int numero) {
        System.out.printf("O dobro de %d é: %d", numero, numero * 2);
    }
}
