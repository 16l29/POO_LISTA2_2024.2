/*Escreva uma classe Conjunto, que represente um conjunto de tamanho variável (crescimento de array
por demanda) de elementos do tipo String. Escreva os seguintes membros para a classe:
a) Um método que permita adicionar um elemento para o conjunto (o elemento não pode existir no
conjunto);
b) Um método que permita verificar se um dado elemento pertence ao Conjunto;
c) Um método uniao, que retorne um novo conjunto de acordo com a semântica da operação união
entre conjuntos (um novo conjunto, sem elementos repetidos, com a combinação dos elementos
dos dois conjuntos originais, o que recebeu a mensagem e o que foi passado como parâmetro);
d) Um método inter, que retorne um novo conjunto de acordo com a semântica da operação
interseção entre conjuntos(um novo conjunto, sem elementos repetidos, com os elementos que
estejam nos dois conjuntos originais ,o que recebeu a mensagem e o que foi passado como
parâmetro);
e) Um método menos, que retorne um novo conjunto de acordo com a semântica da operação
subtração entre conjuntos (um novo conjunto, sem elementos repetidos, com os elementos do
conjunto que recebeu a mensagem, e que não existam no conjunto passado como parâmetro).*/

package JAVA7;

public class Main {
    public static void main(String[] args) {
        Conjunto conjuntoA = new Conjunto();
        conjuntoA.adicionar("A");
        conjuntoA.adicionar("B");
        conjuntoA.adicionar("C");

        Conjunto conjuntoB = new Conjunto();
        conjuntoB.adicionar("B");
        conjuntoB.adicionar("C");
        conjuntoB.adicionar("D");

        System.out.print("Conjunto A: ");
        conjuntoA.mostrarElementos();

        System.out.print("Conjunto B: ");
        conjuntoB.mostrarElementos();

        Conjunto uniao = conjuntoA.uniao(conjuntoB);
        System.out.print("União de A e B: ");
        uniao.mostrarElementos();

        Conjunto interseccao = conjuntoA.inter(conjuntoB);
        System.out.print("Interseção de A e B: ");
        interseccao.mostrarElementos();

        Conjunto subtracao = conjuntoA.menos(conjuntoB);
        System.out.print("Subtração de A menos B: ");
        subtracao.mostrarElementos();
    }
}

