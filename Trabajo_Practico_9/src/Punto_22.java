import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class Punto_22 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        for (int i = 0; i < 5; i ++) {
            listaEnteros.add(random.nextInt(100));
        }
        System.out.println(listaEnteros);
        Collections.sort(listaEnteros);
        System.out.println(listaEnteros);
    }
}
