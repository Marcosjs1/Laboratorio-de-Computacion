import java.util.ArrayList;
import java.util.Scanner;
public class Punto_1 {
    public static void main(String[] args) {
        String auto;
        byte option;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> autos = new ArrayList<String>();

        System.out.println("Bienvenido");
        do{
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Guardar una marca de auto");
            System.out.println("0. Salir");
            option = sc.nextByte();
            if (option == 1){
                System.out.print("Ingrese la marca de auto que desea agregar a la lista: ");
                auto = sc.next();
                autos.add(auto);
            }
        }while (option != 0);
        System.out.print("Las marcas que han sido agregados a la lista son: ");
        System.out.println(autos);
    }
}
