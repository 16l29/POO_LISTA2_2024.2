package JAVA3;

public class Reta {
    private double coeficienteAngular;
    private double coeficienteLinear;

    public Reta(double coeficienteAngular, double coeficienteLinear) {
        this.coeficienteAngular = coeficienteAngular;
        this.coeficienteLinear = coeficienteLinear;
    }

    public Reta(double abscissa1, double ordenada1, double abscissa2, double ordenada2) {
        this.coeficienteAngular = (ordenada2 - ordenada1) / (abscissa2 - abscissa1);
        this.coeficienteLinear = ordenada1 - this.coeficienteAngular * abscissa1;
    }

    public double getCoeficienteAngular() {
        return coeficienteAngular;
    }

    public double getCoeficienteLinear() {
        return coeficienteLinear;
    }

    public boolean pontoPertence(double abscissa, double ordenada) {
        return ordenada == coeficienteAngular * abscissa + coeficienteLinear;
    }

    public double[] intersecao(Reta outra) {
        if (this.coeficienteAngular == outra.coeficienteAngular) {
            return null;
        }

        double abscissaIntersecao = (outra.coeficienteLinear - this.coeficienteLinear) / (this.coeficienteAngular - outra.coeficienteAngular);
        double ordenadaIntersecao = this.coeficienteAngular * abscissaIntersecao + this.coeficienteLinear;

        return new double[]{abscissaIntersecao, ordenadaIntersecao};
    }
}
