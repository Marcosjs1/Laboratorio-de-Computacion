import java.util.Arrays;
import java.util.Collections;
import java.lang.reflect.Array;
public class Punto_13 {
    public static void main(String[] args) {
        int[] array = {1, 7, 3, 2, 5, 10, 9, 8, 4, 6};
        int salto, aux, i;
        boolean cambios;

        for (salto = array.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < array.length; i++)
                {
                    if (array[i - salto] > array[i]) {
                        aux = array[i];
                        array[i] = array[i - salto];
                        array[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
