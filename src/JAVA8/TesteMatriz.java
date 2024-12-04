/*Crie uma classe Matriz que represente uma matriz matemática. Forneça um construtor que permita a
inicialização das dimensões da Matriz
a) Forneça métodos para acesso (leitura/escrita) de cada elemento da matriz.
b) Adicionar duas matrizes;
c) Forneça os métodos adequados para as seguintes operações com matriz:
i. Comparação semântica da matriz;
ii. Retornar a transposta (é aquela onde as linhas se transformam em colunas e as colunas
em linhas) da matriz.
iii. Retornar a oposta (é aquela onde todos os elementos possuem sinais trocados) da matriz;
iv. Gere uma matriz nula (é aqueles onde todos os elementos são iguais a 0);
v. Informe se a matriz é identidade (matriz quadrada onde os elementos da diagonal
principal são todos iguais a 1 e os demais 0);
vi. Informe se a matriz é diagonal (matriz quadrada onde os elementos fora da diagonal
principal são todos iguais a 0).
vii. Informe se a matriz é singular (matriz diagonal onde os elementos da diagonal principal
são todos iguais);
viii. Informe se a matriz é simétrica (uma matriz quadrada é dita simétrica se ela é igual a sua
transposta);
ix. Informe se a matriz é anti-simétrica (uma matriz quadrada é dita anti-simétrica se sua
oposta é igual a sua transposta)
x. Subtrair duas matrizes;
xi. Multiplicar duas matrizes;
xii. Gere uma cópia da matriz.*/

package JAVA8;

import java.util.Scanner;

public class TesteMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da primeira matriz: ");
        int linhas1 = scanner.nextInt();
        System.out.print("Digite o número de colunas da primeira matriz: ");
        int colunas1 = scanner.nextInt();

        Matriz matriz1 = new Matriz(linhas1, colunas1);
        System.out.println("Digite os elementos da primeira matriz:");
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas1; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                double valor = scanner.nextDouble();
                matriz1.setMatriz(i, j, valor);
            }
        }

        System.out.print("Digite o número de linhas da segunda matriz: ");
        int linhas2 = scanner.nextInt();
        System.out.print("Digite o número de colunas da segunda matriz: ");
        int colunas2 = scanner.nextInt();

        Matriz matriz2 = new Matriz(linhas2, colunas2);
        System.out.println("Digite os elementos da segunda matriz:");
        for (int i = 0; i < linhas2; i++) {
            for (int j = 0; j < colunas2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                double valor = scanner.nextDouble();
                matriz2.setMatriz(i, j, valor);
            }
        }

        Matriz transposta1 = OperacoesBasicas.transposta(matriz1);
        System.out.println("Transposta da primeira matriz:");
        for (int i = 0; i < transposta1.linhas; i++) {
            for (int j = 0; j < transposta1.colunas; j++) {
                System.out.print(transposta1.getMatriz(i, j) + " ");
            }
            System.out.println();
        }

        if (matriz1.linhas == matriz2.linhas && matriz1.colunas == matriz2.colunas) {
            Matriz soma = OperacoesEntreMatrizes.subtracao(matriz1, matriz2);
            System.out.println("Subtração das matrizes:");
            for (int i = 0; i < soma.linhas; i++) {
                for (int j = 0; j < soma.colunas; j++) {
                    System.out.print(soma.getMatriz(i, j) + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("As matrizes têm dimensões diferentes e não podem ser subtraídas.");
        }

        Matriz multiplicacao = OperacoesEntreMatrizes.multiplicacao(matriz1, matriz2);
        if (multiplicacao != null) {
            System.out.println("Multiplicação das matrizes:");
            for (int i = 0; i < multiplicacao.linhas; i++) {
                for (int j = 0; j < multiplicacao.colunas; j++) {
                    System.out.print(multiplicacao.getMatriz(i, j) + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("As matrizes não podem ser multiplicadas devido a dimensões incompatíveis.");
        }
    }
}
