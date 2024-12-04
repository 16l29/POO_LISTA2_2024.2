/*Com conceitos de Coleção. Crie uma classe Círculo que possua o atributo raio, adicione um método
para calcular a área do círculo e retornar esse valor, utilizando a seguinte fórmula área π raio². Escreva
um programa Java que crie 5 objetos Círculo de tamanhos diferentes, insira os em uma lista e depois
percorra a lista imprimindo a área de cada círculo armazenado*/

package JAVA12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Circulo> circulos = new ArrayList<>();

        circulos.add(new Circulo(1.0));
        circulos.add(new Circulo(2.5));
        circulos.add(new Circulo(3.0));
        circulos.add(new Circulo(4.5));
        circulos.add(new Circulo(5.0));

        for (Circulo circulo : circulos) {
            System.out.printf("Área do círculo de raio %.2f é: %.2f%n",
                    circulo.getRaio(), circulo.calcularArea());
        }
    }
}