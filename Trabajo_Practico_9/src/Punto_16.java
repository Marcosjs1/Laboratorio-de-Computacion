import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class Punto_16 {
    public static void main(String[] args) {
        String cadena = "";
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Hola ");
        listaNombres.add("mundo");
        listaNombres.add("!");
        for (int i = 0; i < listaNombres.size(); i++){
            cadena += listaNombres.get(i);
        }
        System.out.println(listaNombres);
        System.out.println("La unión de todas las cadenas de la lista es: "+cadena);
    }
}
