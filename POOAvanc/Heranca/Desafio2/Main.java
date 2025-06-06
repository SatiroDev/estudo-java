package POOAvanc.Heranca.Desafio2;

public class Main {
    public static void main(String[] args) {
        Mamifero leao = new Mamifero();
        leao.nome = "Leão";
        leao.idade = 8;
        leao.tipoPelo = "Curto e dourado";
        leao.exibirDados();

        Ave arara = new Ave();
        arara.nome = "Arara";
        arara.idade = 2;
        arara.corPena = "Azul e vermelha";
        arara.exibirDados();

        Reptil jacare = new Reptil();
        jacare.nome = "Jacaré";
        jacare.idade = 12;
        jacare.tipoEscama = "Grossa e esverdeada";
        jacare.exibirDados();

    }
}
