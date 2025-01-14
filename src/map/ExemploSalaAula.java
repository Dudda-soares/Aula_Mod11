package map;

import Classes.Aluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExemploSalaAula {
    public static void main(String[] args) {
        Map<Integer, List<Aluno>> listaSala = new HashMap<>();

        List<Aluno> alunosSala1 = criarTurma("Sala 1", 10);
        listaSala.put(1, alunosSala1);

        List<Aluno> alunosSala2 = criarTurma("Sala2", 30);
        listaSala.put(2, alunosSala2);

        imprimirAlunosSala(listaSala.get(1));
    }
    private static List<Aluno> criarTurma(String sala, int count){
        List<Aluno> alunos =  new ArrayList<>();
        for (int i = 0; i < count; i++){
            Aluno aluno = new Aluno("Nome Aluno" + i, "Curso"+ i, i,sala);
            alunos.add(aluno);
        }
        return alunos;
    }
    private static void imprimirAlunosSala(List<Aluno> alunos){
        for (Aluno aluno : alunos){
            System.out.println("Nome: " + aluno.getNome() + " Sala: " + aluno.getSala());
        }
        System.out.println(" ");
    }
}
