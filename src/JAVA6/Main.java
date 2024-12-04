/*Escreva uma classe Pessoa que representa uma pessoa numa árvore genealógica. A pessoa possui um
nome, um pai e uma mãe (que também são pessoas). Forneça os seguintes membros para a classe:
a) Construtores que:
i) inicialize o nome da pessoa, bem como seus antecessores (pai e mãe);
ii) inicialize o nome da pessoa, e coloque seus antecessores para null;
b) Um método que verifique a igualdade semântica entre duas pessoas (as pessoas são iguais se
possuem o mesmo nome e a mesma mãe)*/

package JAVA6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nome da primeira pessoa: ");
        String nomePessoa1 = scanner.nextLine();

        System.out.print("nome do pai da primeira pessoa: ");
        String nomePai1 = scanner.nextLine();

        System.out.print("nome da mãe da primeira pessoa: ");
        String nomeMae1 = scanner.nextLine();

        Pessoa pai1 = nomePai1.isEmpty() ? null : new Pessoa(nomePai1);
        Pessoa mae1 = nomeMae1.isEmpty() ? null : new Pessoa(nomeMae1);
        Pessoa pessoa1 = new Pessoa(nomePessoa1, pai1, mae1);

        System.out.print("nome da segunda pessoa: ");
        String nomePessoa2 = scanner.nextLine();

        System.out.print("nome do pai da segunda pessoa: ");
        String nomePai2 = scanner.nextLine();

        System.out.print("nome da mãe da segunda pessoa: ");
        String nomeMae2 = scanner.nextLine();

        Pessoa pai2 = nomePai2.isEmpty() ? null : new Pessoa(nomePai2);
        Pessoa mae2 = nomeMae2.isEmpty() ? null : new Pessoa(nomeMae2);
        Pessoa pessoa2 = new Pessoa(nomePessoa2, pai2, mae2);

        if (pessoa1.igual(pessoa2)) {
            System.out.println("as pessoas são semanticamente iguais");
        } else {
            System.out.println("as pessoas não são iguais.");
        }

    }
}