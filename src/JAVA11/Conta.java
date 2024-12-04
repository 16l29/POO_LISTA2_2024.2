package JAVA11;

public abstract class Conta {
    protected double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente\n");
        }
    }

    public double obterSaldo() {
        return this.saldo;
    }
}