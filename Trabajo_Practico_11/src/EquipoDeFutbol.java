import java.util.ArrayList;
import java.util.Scanner;
public class EquipoDeFutbol {
    private ArrayList<String> jugadores;
    private String nombre;
    public void setNombre(String nombre){this.nombre = nombre;}
    public String getNombre(){return nombre;}
    public void agregarJugador(EquipoDeFutbol obj, ArrayList<String> lista){
        String nombreJugador;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del jugador que desea agregar: ");
        nombreJugador = sc.nextLine();
        obj.setNombre(nombreJugador);
        lista.add(nombreJugador);
    }
    public void eliminarJugador(ArrayList<String> lista){
        String nombreJugador;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nombre del jugador que desea eliminar: ");
        nombreJugador = sc.nextLine();
        String AuxNombreJugador = nombreJugador;
        lista.removeIf(str -> str.equals(AuxNombreJugador));
    }
    public static void main(String [] args){
        byte option;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> jugadores = new ArrayList<String>();
        EquipoDeFutbol jugador = new EquipoDeFutbol();
        System.out.println("Bienvenido");
        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Agregar jugadores");
            System.out.println("2. Eliminar jugadores");
            System.out.println("3. Mostrar lista de jugadores");
            System.out.println("0. Salir");
            option = sc.nextByte();
            if (option == 1) {
                jugador.agregarJugador(jugador, jugadores);
            }
            if (option == 2){
                jugador.eliminarJugador(jugadores);
            }
            if (option == 3){
                System.out.println("La lista de jugadores es: ");
                System.out.println(jugadores);
            }
        }while(option != 0);
        System.out.println("Hasta luego!");
    }
}
