/*Escreva em Java uma classe que represente uma reta (𝑦 = 𝑎𝑥 + 𝑏). Forneça os seguintes membros de
classe:
a) Construtores que criem uma reta a partir de:
i. Dois valores, representando o coeficiente angular e o coeficiente linear da reta;
ii. Dois pontos;
b) Métodos de acesso para o coeficiente angular e para o coeficiente linear da reta;
c) Um método que verifique se um ponto dado pertence a reta;
d) Um método que dada uma outra reta, retorne o ponto de interseção da reta dada ou null se as
retas forem paralelas.*/

package JAVA3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reta reta;

        System.out.println("1 - Usar coeficiente angular e linear");
        System.out.println("2 - Usar dois pontos");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("coeficiente angular (coeficienteAngular): ");
            double coeficienteAngular = scanner.nextDouble();
            System.out.print("coeficiente linear (coeficienteLinear): ");
            double coeficienteLinear = scanner.nextDouble();
            reta = new Reta(coeficienteAngular, coeficienteLinear);
        } else if (escolha == 2) {
            System.out.print("abscissa do primeiro ponto: ");
            double abscissa1 = scanner.nextDouble();
            System.out.print("ordenada do primeiro ponto: ");
            double ordenada1 = scanner.nextDouble();
            System.out.print("abscissa do segundo ponto: ");
            double abscissa2 = scanner.nextDouble();
            System.out.print("ordenada do segundo ponto: ");
            double ordenada2 = scanner.nextDouble();
            reta = new Reta(abscissa1, ordenada1, abscissa2, ordenada2);
        } else {
            System.out.println("escolha inválida");
            return;
        }

        System.out.print("abscissa do ponto para verificar se pertence à reta: ");
        double abscissaPonto = scanner.nextDouble();
        System.out.print("ordenada do ponto para verificar se pertence à reta: ");
        double ordenadaPonto = scanner.nextDouble();

        if (reta.pontoPertence(abscissaPonto, ordenadaPonto)) {
            System.out.println("O ponto (" + abscissaPonto + ", " + ordenadaPonto + ") pertence à reta");
        } else {
            System.out.println("O ponto (" + abscissaPonto + ", " + ordenadaPonto + ") não pertence à reta");
        }

        System.out.print("coeficiente angular da segunda reta (coeficienteAngular): ");
        double coeficienteAngular2 = scanner.nextDouble();
        System.out.print("coeficiente linear da segunda reta (coeficienteLinear): ");
        double coeficienteLinear2 = scanner.nextDouble();
        Reta reta2 = new Reta(coeficienteAngular2, coeficienteLinear2);

        double[] pontoIntersecao = reta.intersecao(reta2);
        if (pontoIntersecao != null) {
            System.out.printf("As retas se intersectam no ponto (%.2f, %.2f)%n", pontoIntersecao[0], pontoIntersecao[1]);
        } else {
            System.out.println("As retas são paralelas e não se intersectam");
        }
    }
}
