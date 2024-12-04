package JAVA9;

public class Estabelecimento implements Tributavel {
    private double estabelecimento;

    public Estabelecimento(double estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    @Override
    public double calcularImposto() {
        return estabelecimento * 0.20;
    }
}
