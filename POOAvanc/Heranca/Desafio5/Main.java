package POOAvanc.Heranca.Desafio5;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Tigre("Cleber", 5));

        animais.add(new Pinguim("Jobson", 6));

        animais.add(new Girafa("Cleia", 10));

        for (Animal animal: animais) {
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            animal.emitirSom();
            animal.alimentar();
        }
    }
}
