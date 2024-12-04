/*Com conceitos de Interface Crie um GerenciadorDeImpostoDeRenda, que recebe todos os
tributáveis de uma pessoa e soma seus valores e inclua nele um método para devolver seu total.
Essa classe deve ter um atributo para calcular a soma total dos tributos e um método
adicionar(Tributável) que recebe como parâmetro um Tributável e soma os tributos dele ao total.
Crie um main para instanciar diversas classes que implementam Tributável e passar como
argumento para um GerenciadorDeImpostoDeRenda. Repare que você não pode passar qualquer
tipo de conta para o método adiciona, apenas as que implementam Tributável*/

package JAVA9;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        Salario salario1 = new Salario(10000.00);
        Estabelecimento estabelecimento1 = new Estabelecimento(50000.00);

        gerenciador.adicionar(salario1);
        gerenciador.adicionar(estabelecimento1);


        System.out.printf("Total a pagar: R$ %.2f%n", gerenciador.getTotalImpostos());
    }
}
