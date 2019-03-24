package numeroFaltando;

import org.junit.Assert;
import org.junit.Test;

public class ArrayNumeroFaltandoTest {

    @Test
    public void deveRetornar0PoisNaoExisteNumerofaltando() {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        ArrayNumeroFaltando arrayNumeroFaltando = new ArrayNumeroFaltando();

        int resultado = arrayNumeroFaltando.encontrarNumeroFaltante(array);

        Assert.assertEquals(0, resultado);
    }

    @Test
    public void deveRetornar5PoisNaoExisteNumeroNoArray() {
        int[] array = {1,2,3,4,6,7,8,9,10};
        ArrayNumeroFaltando arrayNumeroFaltando = new ArrayNumeroFaltando();

        int resultado = arrayNumeroFaltando.encontrarNumeroFaltante(array);

        Assert.assertEquals(5, resultado);
    }
}
