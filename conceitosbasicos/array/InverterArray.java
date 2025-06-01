package conceitosbasicos.array;

public class InverterArray {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5};
        int[] nova = inverterLista(lista);
        System.out.println("A lista invertida:");
        for (int n: nova) { 
            System.out.printf("%d ", n);
        }

    }

    public static int[] inverterLista(int[] numeros) {
        int[] nova_lista = new int[numeros.length];
        int contagem = 0;
        for (int i = numeros.length-1; i >=0; i--) {
            nova_lista[contagem] = numeros[i];
            contagem ++;
        }
        return nova_lista;
    }
}
