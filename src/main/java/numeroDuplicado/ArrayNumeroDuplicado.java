package numeroDuplicado;

public class ArrayNumeroDuplicado {

    //DADO UM ARRAY DE INTEIROS MAIORES QUE 0 VERIFICAR QUAL NUMERO SE REPETE PRIMEIRO
    public int encontrarNumeroDuplicado(int[] array) {

        int[] arraySecond = new int[array.length];
        int numeroDuplicado = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (existeNumero(arraySecond, array[i])) {
                numeroDuplicado =  array[i];
                break;
            }
            else
                arraySecond[i] = array[i];
        }
        return numeroDuplicado;
    }
    
    private boolean existeNumero(int [] array, int numero) {
        for (int i : array) {
            if (array[i] == numero)
                return true;
        }
        return false;
    }
}
