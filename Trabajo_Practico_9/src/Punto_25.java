import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class Punto_25 {
    public static void main(String[] args) {
        ArrayList<String> listaCadena = new ArrayList<>();
        listaCadena.add("a");
        listaCadena.add("abcd");
        listaCadena.add("ab");
        listaCadena.add("abcde");
        listaCadena.add("abc");
        System.out.println(listaCadena);
        Collections.sort(listaCadena);
        System.out.println(listaCadena);
    }
}
