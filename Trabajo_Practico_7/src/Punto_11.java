import java.util.Arrays;
import java.util.Collections;
public class Punto_11 {
    public static void main(String[] args) {
        int[] array = {1,7,3,2,5,10,9,8,4,6};
        int pos, j;
        int aux;
        for (pos = 1; pos < array.length; pos++){
            aux = array[pos];
            j = pos - 1;
            while ((j >= 0) && (aux < array[j])){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
        System.out.println(Arrays.toString(array));
    }
}
