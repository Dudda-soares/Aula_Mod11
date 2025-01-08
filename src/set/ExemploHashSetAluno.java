package set;


import Classes.Aluno;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSetAluno {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploConsultando();
        exemploRemover();
    }

    private static void exemploRemover() {
        System.out.println("**** Exemplo Removendo ****");
        Set<Aluno> conjunto = new HashSet<>();

        Aluno a = new Aluno("Eduarda soares","Linux básico", 0);
        Aluno b = new Aluno("Francisco Alencar", "OpenOffice", 0);
        Aluno c = new Aluno("Vinicius Soares","Internet", 0);
        Aluno d = new Aluno("Francisco Alencar", "OpenOffice", 0);
        Aluno e = new Aluno(" Alencar", "OpenOffice", 0);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto);

        conjunto.remove(d);
        System.out.println(conjunto);
    }

    private static void exemploConsultando() {
        System.out.println("**** Exemplo Consultando ****");
        Set<Aluno> conjunto = new HashSet<>();

        Aluno a = new Aluno("Eduarda soares","Linux básico", 0);
        Aluno b = new Aluno("Francisco Alencar", "OpenOffice", 0);
        Aluno c = new Aluno("Vinicius Soares","Internet", 0);
        Aluno d = new Aluno("Francisco Alencar", "OpenOffice", 0);
        Aluno e = new Aluno(" Alencar", "OpenOffice", 0);

        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);
        System.out.println(conjunto.contains(e));
    }

    /*
    *Para nao repetir objetos na lista de alunos é necessario que
    * a classe Aluno implemente o equals e hashcode
     */

    private static void exemploListaSimples() {
        Set<Aluno> conjunto = new HashSet<>();

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
