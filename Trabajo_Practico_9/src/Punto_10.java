import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class Punto_10 {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros1 = new ArrayList<>();
        ArrayList<Integer> listaEnteros2 = new ArrayList<>();
        listaEnteros1.add(1);
        listaEnteros1.add(2);
        listaEnteros1.add(3);
        listaEnteros2.add(4);
        listaEnteros2.add(5);
        listaEnteros2.add(6);
        System.out.println(listaEnteros1);
        System.out.println(listaEnteros2);
        listaEnteros1.addAll(listaEnteros2);
        System.out.println(listaEnteros1);
    }
}
