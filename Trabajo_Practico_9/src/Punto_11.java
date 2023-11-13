import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class Punto_11 {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            listaEnteros.add(i+1);
        }
        System.out.println(listaEnteros);
        for (int i = 0; i < listaEnteros.size(); i++){
            if (listaEnteros.get(i) % 2 == 0){listaEnteros.remove(i);}
        }
        System.out.println(listaEnteros);
    }
}
