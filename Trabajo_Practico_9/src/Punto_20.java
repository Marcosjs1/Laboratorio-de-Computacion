import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class Punto_20 {
    public static void main(String[] args) {
        String elementoMayorLong = "";
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Java");
        listaNombres.add("Programación");
        listaNombres.add("Código");
        for (int i = 0; i < listaNombres.size(); i++){
            if (listaNombres.get(i).length() > elementoMayorLong.length()){
                elementoMayorLong = listaNombres.get(i);
            }
        }
        System.out.println(listaNombres);
        System.out.println("El elemento con más longitud de la lista es: "+elementoMayorLong);
    }
}
