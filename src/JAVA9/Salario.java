package JAVA9;

public class Salario implements Tributavel {
    private double salario;

    public Salario(double valor) {
        this.salario = valor;
    }

    @Override
    public double calcularImposto() {
        return salario * 0.10;
    }
}
