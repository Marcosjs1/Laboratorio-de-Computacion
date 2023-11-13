import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class Punto_18 {
    public static void main(String[] args) {
        int suma = 0;
        Random random = new Random();
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        for (int i = 0; i < 5; i ++) {
            listaEnteros.add(random.nextInt(100));
        }
        for (int i = 0; i < listaEnteros.size(); i++){
            // if (i % 2 == 0 && i != 0) si 0 no cuenta como par
            if (i % 2 == 0) {
                suma += listaEnteros.get(i);
            }
        }
        System.out.println(listaEnteros);
        System.out.println("La suma de todos los elementos de índice par de la lista es: "+suma);
    }
}
