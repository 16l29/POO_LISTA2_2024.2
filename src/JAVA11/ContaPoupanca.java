package JAVA11;

public class ContaPoupanca extends Conta implements Tributavel {

    @Override
    public double calculaTributos() {
        return 0.00;
    }
}