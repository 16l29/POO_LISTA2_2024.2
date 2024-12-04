/*Com conceitos de Interface. Faça o que pede a questão.
a) Crie um projeto interfaces e crie a interface AreaCalculavel com o método calculaArea() - sem
parâmetros e que retorna um double.
b) Criar algumas classes que implementam AreaCalculavel:
I. Quadrado: possui um atributo lado.
II. Retângulo: possui os atributos base e altura.
III. Círculo: possui o atributo raio.
c) Crie uma classe de Teste. No método main crie um vetor de 5 posições que contém alguns
objetos do tipo AreaCalculavel. Logo após, percorra esse vetor imprimindo a área de cada objeto*/

package JAVA10;

public class Main {
    public static void main(String[] args) {
        AreaCalculavel[] formas = new AreaCalculavel[5];

        formas[0] = new Quadrado(4);
        formas[1] = new Retangulo(3, 5);
        formas[2] = new Circulo(2);
        formas[3] = new Quadrado(6);
        formas[4] = new Circulo(3.5);

        for (int i = 0; i < formas.length; i++) {
            System.out.printf("Área da forma %d: %.2f%n", (i + 1), formas[i].calculaArea());
        }
    }
}
