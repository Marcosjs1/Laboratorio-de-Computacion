import java.util.Random;
import java.util.ArrayList;
public class Punto_8 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        ArrayList<Integer> listaEnterosCopia = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listaEnteros.add(random.nextInt(100));
        }
        listaEnterosCopia.addAll(listaEnteros);
        // Tambien se puede usar {ArrayList<Integer> listaEnterosCopia = new ArrayList<>(listaEnteros);} al crear la lista
        System.out.println("Lista original: " + listaEnteros);
        System.out.println("Copia lista original: " + listaEnterosCopia);
    }
}
