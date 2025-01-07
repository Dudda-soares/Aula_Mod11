package list;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExemploArrayListe {

    public static void main(String[] args) {
        exemplosListaSimples();
        exemploListaSimplesOrdenadasAscendente();
    }
    private static void exemplosListaSimples(){

        System.out.println("*** Lista Simples ***");

        Scanner teclado = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        System.out.println("Por favor adicione a lista de nomes : ");
        lista.add(teclado.next());
        lista.add(teclado.next());
        lista.add(teclado.next());
        lista.add(teclado.next());


        System.out.println("me informe qual posição vc gostaria que retornace: ");
        int input = s.nextInt();

        if (input >=0 && input < lista.size()){
            System.out.println("o nome na posição "+ input + " é: " + lista.get(input));
        }else {
            System.out.println("Posição invalida !");
        }



    }
    private static void exemploListaSimplesOrdenadasAscendente(){
        System.out.println("*** Exemplo Lista Ordenada Ascendente ***");
        List <String> lista2 = new ArrayList<>();
        Scanner teclado2 = new Scanner(System.in);

        System.out.println("Por favor adicione a lista de nomes: ");
        lista2.add(teclado2.next());
        lista2.add(teclado2.next());
        lista2.add(teclado2.next());
        Collections.sort(lista2);

        //String listas = lista2.get(0);
        System.out.println(lista2);





    }

}
