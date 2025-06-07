package POOAvanc.Heranca.Desafio4;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Leao("Simba", 5));

        animais.add(new Elefante("Dumbo", 10));

        animais.add(new Macaco("Chico", 3));

        for (Animal animal: animais) {
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            animal.emitirSom();
        }
    }
}
