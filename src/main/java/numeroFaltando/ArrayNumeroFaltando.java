package numeroFaltando;

public class ArrayNumeroFaltando {

    //DADO UM ARRAY DE INTEIROS DE 1 ATE 10 VERIFICAR QUAL NUMERO ESTA FALTANDO
    public int encontrarNumeroFaltante(int [] array) {
        int valorEsperado = 55;
        return valorEsperado - soma(array);
    }

    public int soma(int[] array) {
        int soma = 0;
        for (int i : array) {
            soma = soma + i;
        }

        return soma;
    }
}
