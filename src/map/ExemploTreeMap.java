package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        exemplosListaSimples();
    }
    /**
     * Chave nunca se repete
     * Garante que as chaves estarão em ordem ascendente.
     * pode ser retirado do mapa por chave
     */
    private static void exemplosListaSimples() {
        System.out.println("**** ExemploListaSimples ****");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Eduarda Soares");
        lista.put(4, "Francisco Alencar");
        lista.put(3, "Diana Soares");

        System.out.println(lista);
        System.out.println(" ");
    }
}
