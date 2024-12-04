package LIVRARIA;

public class Livraria {
    private Livro[] estoque;
    private int numLivros;

    public Livraria() {
        this.estoque = new Livro[100];
        this.numLivros = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (numLivros >= 100) {
            System.out.println("Erro: Limite de 100 livros atingido.");
        } else {
            estoque[numLivros] = livro;
            numLivros++;
            System.out.println("Livro adicionado ao estoque: " + livro);
        }
    }

    public Livro buscarLivro(String codigo) {
        for (int i = 0; i < numLivros; i++) {
            if (estoque[i].getCodigo().equals(codigo)) {
                return estoque[i];
            }
        }
        return null;
    }

    public void listarLivros() {
        if (numLivros == 0) {
            System.out.println("Nenhum livro cadastrado no estoque.");
        } else {
            for (int i = 0; i < numLivros; i++) {
                System.out.println(estoque[i]);
            }
        }
    }
}
