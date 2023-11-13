import java.util.Arrays;
import java.util.Collections;
public class Punto_6 {
    public static void main(String[] args) {
        String[] array = {"a","e","f","b","i","c","h","d","g"};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
