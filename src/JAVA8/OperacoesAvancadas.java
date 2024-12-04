package JAVA8;

public class OperacoesAvancadas {

    public static Matriz nula(int linhas, int colunas) {
        return new Matriz(linhas, colunas); // Inicializa com zeros
    }

    public static boolean diagonal(Matriz matriz) {
        if (!matriz.quadrada()) return false;
        for (int i = 0; i < matriz.linhas; i++) {
            for (int j = 0; j < matriz.colunas; j++) {
                if (i != j && matriz.getMatriz(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean identidade(Matriz matriz) {
        if (!matriz.quadrada()) return false;
        for (int i = 0; i < matriz.linhas; i++) {
            for (int j = 0; j < matriz.colunas; j++) {
                if (i == j && matriz.getMatriz(i, j) != 1) return false;
                if (i != j && matriz.getMatriz(i, j) != 0) return false;
            }
        }
        return true;
    }
}
