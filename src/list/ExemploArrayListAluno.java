package list;

import Classes.Aluno;
import Classes.CompararNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListAluno {

    public static void main(String[] args) {
       exemploListaSimplesOrdenadaClasseExterna();
        exemploListaSimplesOrdenadaComparatorAluno();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna(){
        System.out.println("*** exemploListaSimplesOrdenadaClasseExterna() ***");
        List<Aluno> lista = new ArrayList<>();

        Aluno a = new Aluno("João da silva","Linux basico", 0);
        Aluno b = new Aluno("Antonio sousa","OpenOffice", 0);
        Aluno c = new Aluno("Eduarda Soares","Java",10);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno(){
        System.out.println("*** exemploListaSimplesOrdenadaComparatorAluno() ***");
        List<Aluno> lista = new ArrayList<>();

        Aluno a = new Aluno("Francisco Alencar","Linux basico", 30);
        Aluno b = new Aluno("Vinicius Soares","OpenOffice", 20);
        Aluno c = new Aluno("Eduarda Soares","Java",10);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista sem ordenação " + lista );
        Collections.sort(lista);
        System.out.println("Lista com ordenação " + lista );

        CompararNotaAluno comparaNotaAluno = new CompararNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista com ordenação por nota " + lista);
    }
}
