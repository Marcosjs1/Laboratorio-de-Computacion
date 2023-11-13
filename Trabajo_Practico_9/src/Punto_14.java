import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class Punto_14 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        for (int i = 0; i < 5; i ++) {
            listaEnteros.add(random.nextInt(100));
        }
        int menor = listaEnteros.get(0);
        for (int i = 0; i < listaEnteros.size(); i++){
            if (listaEnteros.get(i) < menor){menor = listaEnteros.get(i);}
        }
        System.out.println(listaEnteros);
        System.out.println("El elemento más pequeño de la lista es: "+menor);
    }
}
