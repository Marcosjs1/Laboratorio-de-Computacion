import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class Punto_19 {
    public static void main(String[] args) {
        int num = 5;
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        for (int i = 1; i < 6; i ++) {
            listaEnteros.add(i);
        }
        if (listaEnteros.contains(num)){System.out.println("La lista contiene el número: "+num);}
        else{System.out.println("La lista no contiene el número: "+num);}
    }
}
