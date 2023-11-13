import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class Punto_23 {
    public static void main(String[] args) {
        int num = 50;
        Random random = new Random();
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        for (int i = 0; i < 5; i ++) {
            listaEnteros.add(random.nextInt(100));
        }
        System.out.println(listaEnteros);
        for (int i = 0; i < listaEnteros.size(); i ++) {
            if(listaEnteros.get(i) > num){listaEnteros.remove(i); i--;}
        }
        System.out.println(listaEnteros);
    }
}
