import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class Punto_17 {
    public static void main(String[] args) {
        String elementoActual;
        ArrayList<String> listaCadena = new ArrayList<>();
        listaCadena.add("a");
        listaCadena.add("b");
        listaCadena.add("a");
        listaCadena.add("c");
        listaCadena.add("b");
        System.out.println(listaCadena);
        for (int i = 0; i < listaCadena.size(); i++){
            elementoActual = listaCadena.get(i);
            for (int j = i+1; j < listaCadena.size(); j++){
                if(elementoActual == listaCadena.get(j)){listaCadena.remove(j);}
            }
        }
        System.out.println(listaCadena);
    }
}
