package JAVA8;

public class OperacoesBasicas {

    public static boolean igualdade(Matriz matriz1, Matriz matriz2) {
        if (matriz1.linhas == matriz2.linhas && matriz1.colunas == matriz2.colunas) {
            for (int i = 0; i < matriz1.linhas; i++) {
                for (int j = 0; j < matriz1.colunas; j++) {
                    if (matriz1.getMatriz(i, j) != matriz2.getMatriz(i, j)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static Matriz transposta(Matriz matriz) {
        Matriz novaMatriz = new Matriz(matriz.colunas, matriz.linhas);
        for (int i = 0; i < matriz.linhas; i++) {
            for (int j = 0; j < matriz.colunas; j++) {
                novaMatriz.setMatriz(j, i, matriz.getMatriz(i, j));
            }
        }
        return novaMatriz;
    }

    public static Matriz oposta(Matriz matriz) {
        Matriz novaMatriz = new Matriz(matriz.linhas, matriz.colunas);
        for (int i = 0; i < matriz.linhas; i++) {
            for (int j = 0; j < matriz.colunas; j++) {
                novaMatriz.setMatriz(i, j, matriz.getMatriz(i, j) * -1);
            }
        }
        return novaMatriz;
    }
}
