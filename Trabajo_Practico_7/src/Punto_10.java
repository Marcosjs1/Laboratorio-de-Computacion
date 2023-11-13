import java.util.Arrays;
import java.util.Collections;
public class Punto_10 {
    public static void main(String[] args) {
        int[] array = {1,7,3,2,5,10,9,8,4,6};
        int i, j, menor, pos, aux;
        for (i = 0; i < array.length - 1; i++) {
            menor = array[i];
            pos = i;
            for (j = i + 1; j < array.length; j++){
                if (array[j] < menor) {
                    menor = array[j];
                    pos = j;
                }
            }
            if (pos != i){
                aux = array[i];
                array[i] = array[pos];
                array[pos] = aux;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
