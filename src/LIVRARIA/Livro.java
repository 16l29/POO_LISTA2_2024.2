package LIVRARIA;

public class Livro {
    private String titulo;
    private String autor;
    private String codigo;
    private int quantidade;

    public Livro(String titulo, String autor, String codigo, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public void vender(int quantidadeVendida) {
        if (quantidadeVendida > this.quantidade) {
            System.out.println("Erro: Não há estoque suficiente para vender.");
        } else {
            this.quantidade -= quantidadeVendida;
            System.out.println("Venda realizada: " + quantidadeVendida + " unidades de " + this.titulo);
        }
    }

    public void repor(int quantidadeReposta) {
        this.quantidade += quantidadeReposta;
        System.out.println("Reposição realizada: " + quantidadeReposta + " unidades de " + this.titulo);
    }

    @Override
    public String toString() {
        return "Título: " + this.titulo + ", Autor: " + this.autor + ", Código: " + this.codigo + ", Quantidade em estoque: " + this.quantidade;
    }

    public String getCodigo() {
        return this.codigo;
    }
}
