package encontrarNumeroArray;

import org.junit.Assert;
import org.junit.Test;

public class EncontrarNumeroArrayTest {

    @Test
    public void deveRetornar45PoisExisteNumeroNoArray() {
        EncontrarNumeroArray encontrarNumeroArray = new EncontrarNumeroArray();
        int[] array = {45, 34, 90, 1, 89};

        int numero = encontrarNumeroArray.isExisteNumeroArray(array, 45);

        Assert.assertTrue(numero == 45);
    }

    @Test
    public void deveRetornar0PoisNaoExisteNumeroNoArray() {
        EncontrarNumeroArray encontrarNumeroArray = new EncontrarNumeroArray();
        int[] array = {45, 34, 90, 1, 89};

        int numero = encontrarNumeroArray.isExisteNumeroArray(array, 3);

        Assert.assertTrue(numero == 0);
    }

    @Test
    public void deveRetornar90PoisExisteNumeroNoArrayGigante() {
        EncontrarNumeroArray encontrarNumeroArray = new EncontrarNumeroArray();
        int[] array = new int[1000];

        for (int i = 0; i < 1000; i++) {
            array[i] = i;
        }

        int numero = encontrarNumeroArray.isExisteNumeroArray(array, 999);

        Assert.assertTrue(numero == 999);
    }

    @Test
    public void deveOrderarArray() {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arrayEsperado = {1,2,3,4,5,6,7,8,9,10};
        EncontrarNumeroArray encontrarNumeroArray = new EncontrarNumeroArray();
        int[] arrayRetorno = encontrarNumeroArray.ordernar(array);

        Assert.assertArrayEquals(arrayEsperado, arrayRetorno);
    }
}
