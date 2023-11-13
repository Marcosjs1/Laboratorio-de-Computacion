import java.util.Arrays;
import java.util.Collections;
public class Punto_9 {
    public static void main(String[] args) {
        int[] array = {1,7,3,2,5,10,9,8,4,6};
        int i, j, aux;
        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length -i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
