/*Escreva em Java uma classe que represente um circulo no plano cartesiano. Forneça os seguintes
membros de classe:
a) Um construtor que receba o raio e um ponto (o centro do círculo);
b) Um construtor que receba o raio e posicione o círculo na origem do espaço cartesiano;
c) Métodos de acesso ao atributo raio do círculo;
d) Métodos inflar e desinflar, que, respectivamente, aumentam e diminuem o raio do círculo de um
dado valor;
e) Método que retorna a área do círculo*/

package JAVA4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();

        System.out.print("Informe a coordenada x do centro: ");
        double x = scanner.nextDouble();

        System.out.print("Informe a coordenada y do centro: ");
        double y = scanner.nextDouble();

        Ponto centro = new Ponto(x, y);
        Circulo circulo = new Circulo(raio, centro);

        System.out.println(circulo);

        System.out.println("Área do círculo inicial: " + circulo.calcularArea());

        System.out.print("Informe o valor para inflar o círculo: ");
        double valorInflar = scanner.nextDouble();
        circulo.inflar(valorInflar);
        System.out.println("Após inflar: " + circulo);
        System.out.println("Área do círculo após inflar: " + circulo.calcularArea());

        System.out.print("Informe o valor para desinflar o círculo: ");
        double valorDesinflar = scanner.nextDouble();
        circulo.desinflar(valorDesinflar);
        System.out.println("Após desinflar: " + circulo);
        System.out.println("Área do círculo após desinflar: " + circulo.calcularArea());
    }
}