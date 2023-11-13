import java.util.Random;
import java.util.ArrayList;
public class Punto_7 {
    public static void main(String[] args) {
        int mayor = 0;
        Random random = new Random();
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        for (int i = 0; i < 5; i ++) {
            listaEnteros.add(random.nextInt(100));
        }
        for (int i = 0; i < listaEnteros.size(); i++){
            if (listaEnteros.get(i) > mayor){mayor = listaEnteros.get(i);}
        }
        System.out.println(listaEnteros);
        System.out.println("El elemento más grande de la lista es: "+mayor);
    }
}
