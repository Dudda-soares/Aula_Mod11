package array;

public class ExemploBubbleSortFixo {
    public static void main(String[] args) {
        int[] vetor = {8, 9, 3, 5, 1};
        int auxiliar = 0;
        int i = 0;

        System.out.println("*** Vetor desorganizado ***");

        for (i = 0; i < 5; i++){
            System.out.println(" " + vetor[i]);
        }
        System.out.println(" - ");
         for (i = 0; i < 5; i++){
             for (int compara = 0; compara < 4; compara++){
                 if (vetor[compara] > vetor[compara + 1]){
                     auxiliar = vetor[compara];
                     vetor[compara] = vetor[compara+1];
                     vetor[compara + 1]= auxiliar;
                 }
             }
         }
        System.out.println("vetor organizado ");
         for (i = 0; i < 5; i++){
             System.out.println("-" + vetor[i]) ;
         }

    }
}
