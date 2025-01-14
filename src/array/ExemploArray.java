package array;

public class ExemploArray {
    public static void main(String[] args) {
        declaracaoArray();
        tamanhoArray();
        percorrendoArray1();
        percorrendoArray2();
        arrayBidimensional();

    }

    private static void arrayBidimensional() {
        System.out.println("*** Array Bidimensional ***");

        int [] [] array1 = { {1, 2, 3}, {4, 5, 6} };
        int [] [] array2 = { {7, 8}, {9}, {10, 11, 12} };

        System.out.println("Valores no array1 passados na linha sao");
        outputArray(array1);
        System.out.println("\nValores no array2 passados na linha sao");
        outputArray(array2);
    }

    private static void outputArray(int[][] array) {
        //faz loop pelas linhas do array

        for (int linha = 0; linha < array.length;linha++){
            //faz loop pelas colunas da linha

            for (int coluna = 0; coluna < array[linha].length; coluna++){
                System.out.printf("%d ", array[linha][coluna]);
            }
        }
    }

    private static void percorrendoArray2() {
        System.out.println("*** Percorrendo Array ****");

        int[] arrayNum = {87,68,52,5,49,83,45,12,64};

        //acessando posiçoes
        for (int i = 0 ; i < arrayNum.length; i++){

            System.out.println(arrayNum[i]);

        }


    }

    private static void percorrendoArray1() {
        System.out.println("*** Percorrendo Array ****");

        int[] arrayNum = {87,68,52,5,49,83,45,12,64};
        int total = 0;
        //add o valor de cada elemento ao total(soma todos o valores)

        for (int i : arrayNum){
            total += i;

        }
        System.out.println("1 - Total de alementos ArrayNum: " + total);

    }

    private static void tamanhoArray() {
        System.out.println("*** Tamanho do Array ****");

        int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
        int[] arrayDois = {43,42,4,8,55,21,2,45};

        if (arrayDois.length > 8){
            System.out.println("Tamanho do ArrayDois - maior que 8 posiçoes");
        }else {
            System.out.println("Tamnaho da ArrayDois - menor que 8 posiçoes!");
        }
        System.out.println("\nTamanho do ArrayUm = " + arrayUm.length + "posiçoes") ;

    }

    private static void declaracaoArray() {
        System.out.println("**** Declaração Array ****");
        // [] - São inseridos em uma variavel que referencia um array
        int[] a = new int[4];
        //outra maneira de fazer uma declaracao array
        int[] b;
        b = new int[10];
        // declarando varios arrays
        int[] r = new int[44], k = new int[23];
        //{} inicializar valores em uma array sua declaração
        int[] iniciaValores = {12,32,54,6,8,89,64,64,6};

        //declara um array de inteiros
        int[] meuArray;

        //aloca memoria para 10 inteiros
        meuArray = new int[10];


        //inicializa o primeiro elemento
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;
        meuArray [5] = 952;
        meuArray [6] = 344;
        meuArray [7] = 233;
        meuArray [8] = 622;
        meuArray [9] = 8522;
        //meuArray [10] = 100;

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);



    }
}
