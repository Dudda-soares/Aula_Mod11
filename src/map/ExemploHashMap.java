package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExemploHashMap {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesInterandoValores();
        exemploListaSimplesInterandoChaves();
        exemploListaSimplesInterandoChavesValor();
    }

    private static void exemploListaSimplesInterandoChavesValor() {
        System.out.println("***exemploListaSimplesInterandoChavesValor***");

        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Eduarda Soares");
        lista.put(4, "Francisco Alencar");
        lista.put(3, "Diana Soares");

        System.out.println("FOR comum");
        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for (Map.Entry<Integer, String> e : entry){
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }

        System.out.println("****FOREACH STREAM****");
        lista.entrySet().forEach(e ->{
            System.out.println("Chave: "+ e.getKey());
            System.out.println("Valor: "+ e.getValue());
        });

        System.out.println("FOREACH STRAM1");
        lista.keySet().stream().forEach(System.out::println);

        System.out.println("FOREACH STRAM2");
        lista.values().stream().forEach(System.out::println);

        System.out.println("FOREACH STRAM3");
        lista.forEach((key, value)-> System.out.println(key + " " + value));

        System.out.println("Interator");
        Iterator<Map.Entry<Integer, String >> isto = lista.entrySet().iterator();
        while (isto.hasNext()){
            Map.Entry<Integer, String> entry1 = isto.next();
            System.out.println("Chave: " + entry1.getKey());
            System.out.println("value: " + entry1.getValue());

        }

    }

    private static void exemploListaSimplesInterandoChaves() {
        System.out.println("*** exemploListaSimplesInterandoChaves ***");

        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Eduarda Soares");
        lista.put(4, "Francisco Alencar");
        lista.put(3, "Diana Soares");

        for (Integer value : lista.keySet()){
            System.out.println(value);
        }
    }

    private static void exemploListaSimplesInterandoValores() {
        System.out.println("**** exemploListaSimplesInterandoValores ****");

        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Eduarda Soares");
        lista.put(4, "Francisco Alencar");
        lista.put(3, "Diana Soares");

        for (String value: lista.values()){
            System.out.println(value);
        }
    }


    /**
     * Chave nunca se repete
     * pode ser retirado do mapa por chave
     */
    private static void exemploListaSimples() {
        System.out.println("**** ExemploListaSimples ****");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Eduarda Soares");
        lista.put(4, "Francisco Alencar");
        lista.put(3, "Diana Soares");

        System.out.println(lista);
        System.out.println(" ");

    }
}
