/*Escreva em Java uma classe Ponto2D que represente um ponto no plano cartesiano. Além dos
atributos por você identificados, a classe deve oferecer os seguintes membros:
a) Construtores que permitam a inicialização do ponto:
i. Por default (sem parâmetros) na origem do espaço 2D;
ii. Num local indicado por dois parâmetros do tipo double (indicando o valor de abcissa e
ordenada do ponto que está sendo criado);
iii. Em um local indicado por outro ponto.
b) Métodos de acesso (getter/setter) dos atributos do ponto;
c) Método de comparação semântica do ponto ();
d) Método que permita a distância do ponto que recebe a mensagem, para outro ponto;*/

package JAVA2;

public class Main {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D();

        double abscissa2 = 3.45;
        double ordenada2 = 4.78;

        Ponto2D ponto2 = new Ponto2D(abscissa2, ordenada2);

        System.out.printf("Ponto 1: (abscissa: %.2f, ordenada: %.2f)\n", ponto1.getAbscissa(), ponto1.getOrdenada());
        System.out.printf("Ponto 2: (abscissa: %.2f, ordenada: %.2f)\n", ponto2.getAbscissa(), ponto2.getOrdenada());

        double distancia = ponto1.CalculoDistancia(ponto2);
        System.out.printf("Distância: %.2f", distancia);
    }
}
