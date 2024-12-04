/*Com conceitos de Coleção. Crie uma classe TesteMapaAluno que possui um método main
a) Crie 5 alunos utilizando a classe criada no Exercício 03 e os adicionem num Mapa, onde sua
chave será a matrícula e o valor o objeto aluno.
b) Digite uma matrícula (lido pelo teclado) e imprima os dados do aluno que possui a matrícula
digitada
c) Caso não exista aluno para tal matrícula imprima uma mensagem (“Aluno não encontrado!”)*/

package JAVA16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMapaAluno {
    public static void main(String[] args) {
        Map<Integer, Aluno> mapaAlunos = new HashMap<>();

        mapaAlunos.put(101, new Aluno(101, "Carlos", 8.5, "Engenharia"));
        mapaAlunos.put(102, new Aluno(102, "Ana", 9.0, "Medicina"));
        mapaAlunos.put(103, new Aluno(103, "Mariana", 7.8, "Direito"));
        mapaAlunos.put(104, new Aluno(104, "Yasmin", 8.0, "Arquitetura"));
        mapaAlunos.put(105, new Aluno(105, "Malu", 9.2, "Administração"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a matrícula do aluno que deseja buscar:");
        int matriculaBuscada = scanner.nextInt();

        if (mapaAlunos.containsKey(matriculaBuscada)) {
            Aluno aluno = mapaAlunos.get(matriculaBuscada);
            System.out.println("Dados do aluno:");
            System.out.println(aluno);
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
}
