package ProgramaçãoOrientadaAObjetos;

public class ContaBancaria {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.titular = "José";
        c.saldo = 215.10;

        c.depositar(50);
        c.sacar(250);
        c.sacar(20);
        c.mostrarSaldo();
        
    }
}

class Conta {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }
    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
        else {
            System.out.println("Falha no saque! Saldo insuficiente!");
        }
    }
    void mostrarSaldo() {
        System.out.printf("Seu saldo: R$%.2f",saldo);
    }
}
