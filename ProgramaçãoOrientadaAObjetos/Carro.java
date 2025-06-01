package ProgramaçãoOrientadaAObjetos;

public class Carro {
    public static void main(String[] args) {

        CarroFunc cf = new CarroFunc();
        cf.marca = "Toyota";
        cf.modelo = "Corolla";
        cf.ano = 2021;
        cf.velocidadeAtual = 0;
        
    }
}


class CarroFunc {
    String marca;
    String modelo;
    int ano;
    int velocidadeAtual;

    void acelerar() {
        velocidadeAtual += 10;
    }

    void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10;
        }
        else {
            return;
        }
    }

    void mostrarVelocidade() {
        System.out.printf("Velocidade atual é de %d km/h", velocidadeAtual);
    }

}