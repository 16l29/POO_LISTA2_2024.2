/*Com conceitos de Coleção. Crie uma classe Aluno que possui os atributos matrícula, nome, ira e curso
nessa mesma classe crie um construtor que receba valores como parâmetro para cada atributo da classe.
a) Crie uma classe CadastroAluno que possui uma lista como atributo
b) Adicione métodos para adicionar novos Alunos, outro para ordenar a lista através da matricula
dos alunos e outro para imprimir os elementos presentes na lista;
c) Crie o método main para executar a classe, nele vocês devem digitar os dados de 10 Alunos,
ordenar e imprimir a lista (usando os métodos criados);*/

package JAVA15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("\nAluno " + (i + 1));

            System.out.println("Digite a matrícula do aluno:");
            int matricula = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();

            System.out.println("Digite o IRA do aluno:");
            double ira = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Digite o curso do aluno:");
            String curso = scanner.nextLine();

            Aluno aluno = new Aluno(matricula, nome, ira, curso);
            cadastro.adicionarAluno(aluno);
        }

        cadastro.ordenarPorMatricula();
        System.out.println("\nLista de Alunos Ordenada por Matrícula:");
        cadastro.imprimirAlunos();

    }
}
