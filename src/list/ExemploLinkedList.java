package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {

    public static void main(String[] args) {
        exemploListaSimples();

    }

    private static void exemploListaSimples(){
        System.out.println("**** exemploListaSimples ****");
        List<String> lista = new LinkedList<>();
        lista.add("Joao da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lucia Ferreira");
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);

        boolean contem =  lista.contains("Joao da Silva");
        System.out.println(contem);

        for (String nome : lista){
            System.out.println(nome);
        }
    }
}
