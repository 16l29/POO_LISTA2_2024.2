package LIVRARIA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Operações:");
            System.out.println("1. Adicionar um novo livro");
            System.out.println("2. Buscar livro pelo código");
            System.out.println("3. Vender livro");
            System.out.println("4. Repor livro");
            System.out.println("5. Listar todos os livros");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o código do livro: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Digite a quantidade inicial do livro: ");
                    int quantidade = scanner.nextInt();
                    Livro livro = new Livro(titulo, autor, codigo, quantidade);
                    livraria.adicionarLivro(livro);
                    break;

                case 2:
                    System.out.print("Digite o código do livro que deseja buscar: ");
                    String codigoBusca = scanner.nextLine();
                    Livro livroEncontrado = livraria.buscarLivro(codigoBusca);
                    if (livroEncontrado != null) {
                        System.out.println("Livro encontrado: " + livroEncontrado);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o código do livro que deseja vender: ");
                    String codigoVenda = scanner.nextLine();
                    Livro livroParaVender = livraria.buscarLivro(codigoVenda);
                    if (livroParaVender != null) {
                        System.out.print("Digite a quantidade que deseja vender: ");
                        int qtdVenda = scanner.nextInt();
                        livroParaVender.vender(qtdVenda);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o código do livro que deseja repor: ");
                    String codigoReposicao = scanner.nextLine();
                    Livro livroParaRepor = livraria.buscarLivro(codigoReposicao);
                    if (livroParaRepor != null) {
                        System.out.print("Digite a quantidade a ser reposta: ");
                        int qtdReposicao = scanner.nextInt();
                        livroParaRepor.repor(qtdReposicao);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 5:
                    livraria.listarLivros();
                    break;

                case 6:
                    System.out.println("Saindo do sistema");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 6);

    }
}