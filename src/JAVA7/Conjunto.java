package JAVA7;

import java.util.ArrayList;

public class Conjunto {

    private ArrayList<String> elementos;

    public Conjunto() {
        this.elementos = new ArrayList<>();
    }

    public void adicionar(String elemento) {
        if (!this.contem(elemento)) {
            this.elementos.add(elemento);
        }
    }

    public boolean contem(String elemento) {
        return this.elementos.contains(elemento);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Conjunto outro = (Conjunto) obj;

        return this.elementos.equals(outro.elementos);
    }

    public Conjunto uniao(Conjunto outro) {
        Conjunto resultado = new Conjunto();

        for (String elemento : this.elementos) {
            resultado.adicionar(elemento);
        }

        for (String elemento : outro.elementos) {
            resultado.adicionar(elemento);
        }

        return resultado;
    }

    public Conjunto inter(Conjunto outro) {
        Conjunto resultado = new Conjunto();

        for (String elemento : this.elementos) {
            if (outro.contem(elemento)) {
                resultado.adicionar(elemento);
            }
        }

        return resultado;
    }

    public Conjunto menos(Conjunto outro) {
        Conjunto resultado = new Conjunto();

        for (String elemento : this.elementos) {
            if (!outro.contem(elemento)) {
                resultado.adicionar(elemento);
            }
        }

        return resultado;
    }

    public void mostrarElementos() {
        System.out.println(elementos);
    }
}