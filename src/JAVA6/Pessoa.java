package JAVA6;

public class Pessoa extends Individuo {
    private Pessoa pai;
    private Pessoa mae;

    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        super(nome);
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome) {
        this(nome, null, null);
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public boolean igual(Pessoa outraPessoa) {
        if (!this.nome.equals(outraPessoa.getNome())) {
            return false;
        }

        if ((this.mae == null && outraPessoa.getMae() != null) ||
                (this.mae != null && outraPessoa.getMae() == null) ||
                (this.mae != null && outraPessoa.getMae() != null &&
                        !this.mae.getNome().equals(outraPessoa.getMae().getNome()))) {
            return false;
        }

        if ((this.pai == null && outraPessoa.getPai() != null) ||
                (this.pai != null && outraPessoa.getPai() == null) ||
                (this.pai != null && outraPessoa.getPai() != null &&
                        !this.pai.getNome().equals(outraPessoa.getPai().getNome()))) {
            return false;
        }

        return true;
    }
}
