package JAVA2;

public class Ponto2D {
    public double abscissa;
    public double ordenada;

    public Ponto2D() {
        this.abscissa = 0.0;
        this.ordenada = 0.0;
    }

    public Ponto2D(double abscissa, double ordenada) {
        this.abscissa = abscissa;
        this.ordenada = ordenada;
    }

    public double getAbscissa() {
        return abscissa;
    }

    public void setAbscissa(double abscissa) {
        this.abscissa = abscissa;
    }

    public double getOrdenada() {
        return ordenada;
    }

    public void setOrdenada(double ordenada) {
        this.ordenada = ordenada;
    }

    public double CalculoDistancia(Ponto2D outroPonto) {
        double dx = this.abscissa - outroPonto.abscissa;
        double dy = this.ordenada - outroPonto.ordenada;

        return Math.sqrt(dx * dx + dy * dy);
    }
}
