/*Com conceitos de Interface Nosso banco precisa tributar dinheiro de alguns bens que nossos
clientes possuem. Para isso, vamos criar um sistema para isso.
a) Crie uma interface Tributável que possui o método calculaTributos(), que retorna um double.
b) Alguns bens são tributáveis e outros não, ContaPoupanca não é tributável, já para
ContaCorrente você precisa pagar 1% da conta e o SeguroDeVida tem uma taxa fixa de 42 reais.
c) As classes ContaCorrente e ContaPoupanca herdam de uma classe Conta. Essa classe Conta
possui um saldo e os métodos sacar(double), depositar(double) e obterSaldo() que retorna o saldo
da conta.
d) Criar uma classe TestaTributavel com um método main para testar o nosso exemplo.*/

package JAVA11;

import java.util.Scanner;

public class TestaTributavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        SeguroDeVida seguro = new SeguroDeVida();

        while (true) {
            System.out.println("1. Depositar na Conta Corrente");
            System.out.println("2. Depositar na Conta Poupança");
            System.out.println("3. Sacar da Conta Corrente");
            System.out.println("4. Sacar da Conta Poupança");
            System.out.println("5. Saldo da Conta Corrente");
            System.out.println("6. Saldo da Conta Poupança");
            System.out.println("7. Tributo da Conta Corrente");
            System.out.println("8. Tributo da Conta Poupança");
            System.out.println("9. Tributo do Seguro de Vida");
            System.out.println("10. Sair");
            System.out.print("\nEscolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("\nValor p/ depositar na Conta Corrente: R$");
                    double valorCC = scanner.nextDouble();
                    cc.depositar(valorCC);
                    System.out.println("Depósito realizado\n");
                    break;
                case 2:
                    System.out.print("\nValor p/ depositar na Conta Poupança: R$");
                    double valorCP = scanner.nextDouble();
                    cp.depositar(valorCP);
                    System.out.println("Depósito realizado\n");
                    break;
                case 3:
                    System.out.print("\nValor p/ sacar da Conta Corrente: R$");
                    double saqueCC = scanner.nextDouble();
                    cc.sacar(saqueCC);
                    break;
                case 4:
                    System.out.print("\nValor p/ sacar da Conta Poupança: R$");
                    double saqueCP = scanner.nextDouble();
                    cp.sacar(saqueCP);
                    break;
                case 5:
                    System.out.println("\nSaldo da Conta Corrente: R$" + cc.obterSaldo() + "\n");
                    break;
                case 6:
                    System.out.println("\nSaldo da Conta Poupança: R$" + cp.obterSaldo() + "\n");
                    break;
                case 7:
                    System.out.println("\nTributo da Conta Corrente R$" + cc.calculaTributos() + "\n");
                    break;
                case 8:
                    System.out.println("\nTributo da Conta Poupança: R$" + cp.calculaTributos() + "\n");
                    break;
                case 9:
                    System.out.println("\nTributo do Seguro de Vida: R$" + seguro.calculaTributos() + "\n");
                    break;
                case 10:
                    return;
                default:
                    System.out.println("\nInválido\n");
            }
        }
    }
}