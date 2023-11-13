import java.util.Arrays;
import java.util.Collections;
public class Punto_2 {
    public static void main(String[] args) {
        Integer[] array = {10,64,4,1,100,75,52,13,26,82};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
