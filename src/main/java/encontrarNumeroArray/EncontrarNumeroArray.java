package encontrarNumeroArray;


public class EncontrarNumeroArray {

    //PROCURAR EM UM ARRAY UM NUMERO ESPECIFICO SEM FAZER PESQUISA LINEAR
    public int isExisteNumeroArray(int[] array, int numero) {
        //Primeiro passo de uma boa pesquisa é ordenar o array
        array = ordernar(array);

        while (array.length  > 1) {
            array = splitArray(array, numero);
        }

        int numeroEncontrado = array[0];

        return numero == numeroEncontrado ? numero : 0;
    }

    private int[] splitArray(int[] array, int numero) {
        int tamanhoArray = array.length;

        int a[] = new int[(tamanhoArray + 1) / 2];
        int b[] = new int[tamanhoArray - a.length];

        for (int i = 0; i < tamanhoArray; i++)
        {
            if (i < a.length)
                a[i] = array[i];
            else
                b[i - a.length] = array[i];
        }

        if (numero <= a[a.length - 1])
            return a;
        else
            return b;
    }


    public int[] ordernar(int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j ++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        return array;
    }
}
