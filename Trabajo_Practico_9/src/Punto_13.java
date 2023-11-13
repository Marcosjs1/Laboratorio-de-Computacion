import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class Punto_13 {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros1 = new ArrayList<>();
        ArrayList<Integer> listaEnteros2 = new ArrayList<>();
        listaEnteros1.add(1);
        listaEnteros1.add(2);
        listaEnteros1.add(3);
        listaEnteros2.add(2);
        listaEnteros2.add(1);
        listaEnteros2.add(3);
        System.out.println(listaEnteros1);
        System.out.println(listaEnteros2);
        if (listaEnteros1.equals(listaEnteros2)){
            System.out.println("Los arrays son iguales");
        }else{System.out.println("Los arrays no son iguales");}
    }
}
