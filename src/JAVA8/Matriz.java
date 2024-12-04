package JAVA8;

public class Matriz {
    private double[][] elementos;
    public int linhas;
    public int colunas;

    public Matriz(int linhas, int colunas) {
        elementos = new double[linhas][colunas];
        this.linhas = linhas;
        this.colunas = colunas;
    }

    public double getMatriz(int linha, int coluna) {
        return elementos[linha][coluna];
    }

    public void setMatriz(int linha, int coluna, double valor) {
        elementos[linha][coluna] = valor;
    }

    public boolean quadrada() {
        return linhas == colunas;
    }
}
