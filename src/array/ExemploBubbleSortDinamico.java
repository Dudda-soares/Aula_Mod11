package array;

import java.util.Scanner;

public class ExemploBubbleSortDinamico {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os numeros seprados por , ");

        String resposta = teclado.next();
        String [] vetorString = resposta.split(",");

        int[] vetor = convert(vetorString);
        int aux = 0;
        int i = 0;

        System.out.println("Vetor desordenado: ");
        for (i = 0; i < vetorString.length; i++){
            System.out.println(" "+ vetor[i]);
        }
        System.out.println(" ");

        for (i = 0; i < vetor.length; i++){
            for (int j = 0; j < vetor.length -1; j++){
                if (vetor[j] > vetor[j + 1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado ");
        for (i = 0; i < vetor.length; i++){
            System.out.println(" "+vetor[i]);
        }
    }

    private static int[] convert(String[] vetorString){
        int[] numeros = new int[vetorString.length];
        for (int i = 0; i < vetorString.length; i++){
            numeros[i] = Integer.parseInt(vetorString[i]);
        }
        return numeros;
    }
}
