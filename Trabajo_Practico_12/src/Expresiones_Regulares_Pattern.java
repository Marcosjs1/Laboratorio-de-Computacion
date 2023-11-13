import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
public class Expresiones_Regulares_Pattern {
    public static void main(String[] args) {
        ArrayList<String> datos1 = new ArrayList<>();

        //nombre y apellido
        datos1.add("Emanuel Rojas");

        //DNI (XXXXXXXX (8) || XXXXXXX (7))
        datos1.add("46396605");
        //correo electrónico (xxxxx@dominio.(com/eu/cl/etc.))
        datos1.add("matirojasemanuel@gmail.com");
        //número telefónico (+XX XXX XXX XXXX)
        datos1.add("+54 261 645 2668");

        // Creamos el objeto Pattern "patronNombre" y le asignamos una expresión regular
        Pattern patronNombre = Pattern.compile("^([A-Z][a-z]+)\\s([A-Z][a-z]+)$");
        // Creamos el objeto Matcher "coincidenciaNombre" que guardará las coincidencias del patrón dado en el
        // texto asignado. En este caso siendo el texto asignado el guardado en el array datos1 en la posición 0
        Matcher coincidenciaNombre = patronNombre.matcher(datos1.get(0));

        Pattern patronDNI = Pattern.compile("^[0-9]{7,8}$");
        Matcher coincidenciaDNI = patronDNI.matcher(datos1.get(1));

        Pattern patronCorreo = Pattern.compile("^[A-Za-z0-9._$%-]+@[A-Za-z]+\\.[a-z]{2,3}$");
        Matcher coincidenciaCorreo = patronCorreo.matcher(datos1.get(2));

        Pattern patronTelefono = Pattern.compile("^\\+\\d{2}\\s\\d{3}\\s\\d{3}\\s\\d{4}$");
        Matcher coincidenciaTelefono = patronTelefono.matcher(datos1.get(3));

        //Comprobación datos 1:
        System.out.println("Validación datos 1:");
        if (coincidenciaNombre.matches()) {
            System.out.println("Nombre válido");
        }
        if (coincidenciaDNI.matches()) {
            System.out.println("DNI válido");
        }
        if (coincidenciaCorreo.matches()) {
            System.out.println("Correo válido");
        }
        if (coincidenciaTelefono.matches()) {
            System.out.println("Número telefónico válido");
        }
    }
}
