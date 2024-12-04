/*Com conceitos de Coleção. Crie uma classe TesteHashSetCPF que possui um método main.
a) Dentro do main crie um HashSet de String
b) Adicione 10 CPF Strings informados pelo usuário (utilizando um laço de repetição)
c) Digite alguns CPF repetidos e verifique o conteúdo do conjunto criado HashSet utilizando um
for para percorrê-lo.*/

package JAVA13;

import java.util.Scanner;
import java.util.HashSet;

public class TesteHashSetCPF {
    public static void main(String[] args) {
        HashSet<String> cpfs = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 CPFs:");

        for (int i = 0; i < 10; i++) {
            System.out.print("CPF " + (i + 1) + ": ");
            String cpf = scanner.nextLine();
            cpfs.add(cpf);
        }

        System.out.println("\nConteúdo do HashSet:");

        for (String cpf : cpfs) {
            System.out.println(cpf);
        }
    }
}