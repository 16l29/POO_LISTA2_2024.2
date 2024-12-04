package JAVA9;

public class GerenciadorDeImpostoDeRenda {
    private double totalImpostos;

    public GerenciadorDeImpostoDeRenda() {
        this.totalImpostos = 0.0;
    }

    public void adicionar(Tributavel tributavel) {
        this.totalImpostos += tributavel.calcularImposto();
    }

    public double getTotalImpostos() {
        return this.totalImpostos;
    }
}