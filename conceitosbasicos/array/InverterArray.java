package conceitosbasicos.array;

public class InverterArray {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5};
        int[] nova = inverterLista(lista);
        for (int n: nova) {
            System.out.println(n);
        }

    }

    public static int[] inverterLista(int[] numeros) {
        int[] nova_lista = new int[numeros.length];
        int contagem = 0;
        for (int i = numeros.length; i >=0; i--) {
            nova_lista[contagem] = numeros[i];
        }
        return nova_lista;
    }
}
