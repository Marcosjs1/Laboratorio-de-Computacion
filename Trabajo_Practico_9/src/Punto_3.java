import java.util.ArrayList;
public class Punto_3 {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        for (int i = 1; i < 6; i ++) {
            listaEnteros.add(i);
        }
        System.out.println(listaEnteros);
        for (int i = 0; i < listaEnteros.size(); i ++){
            System.out.println(listaEnteros.get(i));
        }
    }
}
