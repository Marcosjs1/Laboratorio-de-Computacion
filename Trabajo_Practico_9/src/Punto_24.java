import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class Punto_24 {
    public static void main(String[] args) {
        String elemento = "a";
        int ocurrenciaElemento = 0;
        ArrayList<String> listaCadena = new ArrayList<>();
        listaCadena.add("a");
        listaCadena.add("b");
        listaCadena.add("a");
        listaCadena.add("c");
        listaCadena.add("a");
        System.out.println(listaCadena);
        for (int i = 0; i < listaCadena.size(); i++){
            if(listaCadena.get(i) == elemento){ocurrenciaElemento++;}
        }
        System.out.println("El elemento '"+elemento+"' aparece "+ocurrenciaElemento+" veces en la lista");
    }
}
