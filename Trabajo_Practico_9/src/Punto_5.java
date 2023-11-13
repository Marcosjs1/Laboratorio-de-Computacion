import java.util.ArrayList;
public class Punto_5 {
    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Juan Baez");
        listaNombres.add("Carlos Lucero");
        listaNombres.add("Raúl Caceres");
        System.out.println(listaNombres);
        // Por index:
        listaNombres.remove(0);
        System.out.println(listaNombres);
        // Por valor:
        listaNombres.removeIf(str -> str.equals("Carlos Lucero"));
        System.out.println(listaNombres);
    }
}
