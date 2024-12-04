/*Com conceitos de Coleção. Escreva para a classe ConjuntoDePalavras um método contemTodas
String palavras) que receba como argumento uma string contendo várias palavras separadas por espaços
e que retorne true se cada uma das palavras existir no conjunto (Set) encapsulado na classe.
a) Informar as palavras que vão compor o conjunto (dentro do construtor da classe)
b) Ler a linha com as String separadas por espaço.*/

package JAVA14;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavras {
    private Set<String> conjunto;

    public ConjuntoDePalavras() {
        conjunto = new HashSet<>();
        conjunto.add("java");
        conjunto.add("poo");
        conjunto.add("intellij");
        conjunto.add("vscode");
        conjunto.add("codigo");
    }

    public boolean contemTodas(String palavras) {
        String[] palavrasArray = palavras.trim().split("\\s+");
        for (String palavra : palavrasArray) {
            if (!conjunto.contains(palavra)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ConjuntoDePalavras cp = new ConjuntoDePalavras();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as palavras separadas por espaço:");
        String linha = scanner.nextLine();
        if (cp.contemTodas(linha)) {
            System.out.println("Todas as palavras estão no conjunto.");
        } else {
            System.out.println("Nem todas as palavras estão no conjunto.");
        }
    }
}