package JAVA15;

import java.util.ArrayList;

public class CadastroAluno {
    private ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void ordenarPorMatricula() {
        for (int i = 0; i < listaAlunos.size() - 1; i++) {
            for (int j = 0; j < listaAlunos.size() - i - 1; j++) {
                if (listaAlunos.get(j).getMatricula() > listaAlunos.get(j + 1).getMatricula()) {
                    Aluno temp = listaAlunos.get(j);
                    listaAlunos.set(j, listaAlunos.get(j + 1));
                    listaAlunos.set(j + 1, temp);
                }
            }
        }
    }

    public void imprimirAlunos() {
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }
}
