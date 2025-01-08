package set;

import Classes.Aluno;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSetAluno {

    public static void main(String[] args) {
        exemploSimples();
    }

    private static void exemploSimples() {
        Set<Aluno> conjunto = new TreeSet<>();

        Aluno a = new Aluno("Eduarda soares","Linux básico", 0);
        Aluno b = new Aluno("Francisco Alencar", "OpenOffice", 0);
        Aluno c = new Aluno("Vinicius Soares","Internet", 0);
        Aluno d = new Aluno("Francisco Alencar", "OpenOffice", 0);


        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);
    }
}
