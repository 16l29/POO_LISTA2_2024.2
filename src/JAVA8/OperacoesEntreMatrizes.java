package JAVA8;

public class OperacoesEntreMatrizes {

    public static Matriz subtracao(Matriz matriz1, Matriz matriz2) {
        if (matriz1.linhas == matriz2.linhas && matriz1.colunas == matriz2.colunas) {
            Matriz novaMatriz = new Matriz(matriz1.linhas, matriz1.colunas);
            for (int i = 0; i < matriz1.linhas; i++) {
                for (int j = 0; j < matriz1.colunas; j++) {
                    double valor = matriz1.getMatriz(i, j) - matriz2.getMatriz(i, j);
                    novaMatriz.setMatriz(i, j, valor);
                }
            }
            return novaMatriz;
        }
        return null;
    }

    public static Matriz multiplicacao(Matriz matriz1, Matriz matriz2) {
        if (matriz1.colunas == matriz2.linhas) {
            Matriz novaMatriz = new Matriz(matriz1.linhas, matriz2.colunas);
            for (int i = 0; i < matriz1.linhas; i++) {
                for (int j = 0; j < matriz2.colunas; j++) {
                    double valor = 0;
                    for (int k = 0; k < matriz1.colunas; k++) {
                        valor += matriz1.getMatriz(i, k) * matriz2.getMatriz(k, j);
                    }
                    novaMatriz.setMatriz(i, j, valor);
                }
            }
            return novaMatriz;
        }
        return null;
    }
}
