package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {
        //exemplosSimples();
        exemploListaSimplesOrdenadaAscendente();
    }

    /**
     * Não repete valores na lista
     */

    private static void exemplosSimples() {
        System.out.println("**** exemploListaSimples ****");
        Scanner teclado = new Scanner(System.in);

        Set<String> lista = new HashSet<>();

        System.out.println("Por favor adicione os nomes na lista: ");
        lista.add(teclado.next());
        lista.add(teclado.next());
        lista.add(teclado.next());
        lista.add(teclado.next());
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenadaAscendente() {
        System.out.println("**** ExemploListaSimplesOrdenadaAscendente ****");
        Scanner input = new Scanner(System.in);

        Set<String> lista = new HashSet<>();

        System.out.println("Por favor digite os nomes que deseja incluir na lista:");
        lista.add(input.next());
        lista.add(input.next());
        lista.add(input.next());
        lista.add(input.next());
        //Collections.sort(lista);
        System.out.println(lista);

    }
}
