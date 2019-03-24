package numeroDuplicado;

import org.junit.Assert;
import org.junit.Test;

public class ArrayNumeroDuplicadoTest {

    @Test
    public void deveRetornar2PoisEstaDuplicado() {
        int array[] = {1, 2, 3, 4, 5, 2};
        ArrayNumeroDuplicado arrayNumeroDuplicado = new ArrayNumeroDuplicado();
        int retorno = arrayNumeroDuplicado.encontrarNumeroDuplicado(array);

        Assert.assertEquals(2, retorno);
    }
}
