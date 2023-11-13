import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Expresiones_Regulares_Funciones {
    public static void main(String[] args) {
        ArrayList <String> datos1 = new ArrayList<>();
        ArrayList <String> datos2 = new ArrayList<>();
        ArrayList <String> datos3 = new ArrayList<>();

        //nombre y apellido
        datos1.add("Emanuel Rojas");
        datos2.add("Felipe");
        datos3.add("Ju4n Z4p4t4");
        //DNI (XXXXXXXX (8) || XXXXXXX (7))
        datos1.add("46396605");
        datos2.add("4032124");
        datos3.add("1234");
        //correo electrónico (xxxxx@dominio.(com/eu/cl/etc.))
        datos1.add("matirojasemanuel@gmail.com");
        datos2.add("Jose4124@hotmail.com");
        datos3.add("ju4n1t0.com");
        //número telefónico (+XX XXX XXX XXXX)
        datos1.add("+54 261 645 2668");
        datos2.add("+54 120 432 7683");
        datos3.add("+542614521458");

        //Comprobación datos 1:
        System.out.println("Validación datos 1:");
        System.out.println("Nombre válido: "+comprobarNombre(datos1));
        System.out.println("DNI válido: "+comprobarDNI(datos1));
        System.out.println("Correo válido: "+comprobarCorreo(datos1));
        System.out.println("Número telefónico válido: "+comprobarTelefono(datos1));
        System.out.println();
        //Comprobación datos 2:
        System.out.println("Validación datos 2:");
        System.out.println("Nombre válido: "+comprobarNombre(datos2));
        System.out.println("DNI válido: "+comprobarDNI(datos2));
        System.out.println("Correo válido: "+comprobarCorreo(datos2));
        System.out.println("Número telefónico válido: "+comprobarTelefono(datos2));
        System.out.println();
        //Comprobación datos 3:
        System.out.println("Validación datos 3:");
        System.out.println("Nombre válido: "+comprobarNombre(datos3));
        System.out.println("DNI válido: "+comprobarDNI(datos3));
        System.out.println("Correo válido: "+comprobarCorreo(datos3));
        System.out.println("Número telefónico válido: "+comprobarTelefono(datos3));
    }
    public static boolean comprobarNombre(ArrayList <String> listaDatos){
        return listaDatos.get(0).matches("^([A-Z][a-z]+)\\s([A-Z][a-z]+)$");
    }
    public static boolean comprobarDNI(ArrayList <String> listaDatos){
        return listaDatos.get(1).matches("^[0-9]{7,8}$");
    }
    public static boolean comprobarCorreo(ArrayList <String> listaDatos){
        return listaDatos.get(2).matches("^[A-Za-z0-9._$%-]+@[A-Za-z0-9]+\\.[a-z]{2,3}$");
    }
    public static boolean comprobarTelefono(ArrayList <String> listaDatos){
        return listaDatos.get(3).matches("^\\+\\d{2}\\s\\d{3}\\s\\d{3}\\s\\d{4}$");
    }
}
