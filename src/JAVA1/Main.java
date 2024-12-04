/*Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de itens ou
eventos. A classe deve oferecer métodos que devem:
a) Zerar;
b) Incrementar;
c) Retornar o valor do contador.*/

package JAVA1;

public class Main {
    public static void main(String[] args) {
        Contador c1 = new Contador();

        int incremento = 5;

        for (int i = 0; i < incremento; i++) {
            c1.incrementar();
        }

        System.out.println("Valor do contador: " + c1.getValor());

        c1.zerar();

        System.out.println("Valor após zerar: " + c1.getValor());
    }
}

