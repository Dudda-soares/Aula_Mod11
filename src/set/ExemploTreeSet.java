package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {
        exemplosSimples();
    }
    /*
    * Não repete valores na lista
    * tem ordem natual dos objetos
     */

    private static void exemplosSimples() {
        System.out.println("**** exemploListaSimples ****");
        Scanner teclado = new Scanner(System.in);

        Set<String> lista = new TreeSet<>();

        System.out.println("Por favor adicione os nomes na lista: ");
        lista.add(teclado.next());
        lista.add(teclado.next());
        lista.add(teclado.next());
        lista.add(teclado.next());
        System.out.println(lista);
        System.out.println("");
    }
}
