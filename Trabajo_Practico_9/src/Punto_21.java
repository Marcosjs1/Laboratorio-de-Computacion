import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class Punto_21 {
    public static void main(String[] args) {
        double promedio = 0;
        Random random = new Random();
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        for (int i = 0; i < 5; i ++) {
            listaEnteros.add(random.nextInt(100));
        }
        for (int i = 0; i < listaEnteros.size(); i++){
            promedio += listaEnteros.get(i);
        }
        promedio = promedio / listaEnteros.size();
        System.out.println(listaEnteros);
        System.out.println("El promedio de todos los elementos de la lista es: "+promedio);
    }
}
