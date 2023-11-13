import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //•	Comprobar si el String cadena no acaba con un dígito.
        System.out.println("Comprobar si el String cadena no acaba con un dígito.");
        Pattern noAcabaEnDigito = Pattern.compile("\\D$");
        String cadena = "texto";
        Matcher cadenaMatcher = noAcabaEnDigito.matcher(cadena);
        System.out.println(cadena);
        System.out.println(cadenaMatcher.find());
        cadena = "texto2";
        System.out.println(cadena);
        System.out.println(cadenaMatcher.find());
        System.out.println();

        //•	Comprobar si el String cadena no empieza por un dígito.
        System.out.println("Comprobar si el String cadena no empieza por un dígito.");
        Pattern noEmpiezaEnDigito = Pattern.compile("^\\D");
        cadenaMatcher = noEmpiezaEnDigito.matcher(cadena);
        cadena = "texto1";
        System.out.println(cadena);
        System.out.println(cadenaMatcher.find());
        cadena = "2texto";
        System.out.println(cadena);
        System.out.println(cadenaMatcher.find());
        System.out.println();

        //•	Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10.
        System.out.println("Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10.");
        Pattern minYMaxLetras = Pattern.compile("[a-zA-Z]{5,10}");
        cadenaMatcher = minYMaxLetras.matcher(cadena);
        cadena = "abcdef";
        System.out.println(cadena);
        System.out.println(cadenaMatcher.find());
        cadena = "abc";
        System.out.println(cadena);
        System.out.println(cadenaMatcher.find());
        cadena = "abcdefghijkl";
        System.out.println(cadena);
        System.out.println(cadenaMatcher.find());
        System.out.println();

        //•	Validar el ingreso de un DNI (xx-xxx-xxx).
        System.out.println("Validar el ingreso de un DNI (xx-xxx-xxx).");
        Pattern DNI = Pattern.compile("^[0-9]{2}-[0-9]{3}-[0-9]{3}$");
        cadena = "46-396-605";
        cadenaMatcher = DNI.matcher(cadena);
        System.out.println(cadena);
        System.out.println(cadenaMatcher.matches());
        cadena = "46 396 605";
        cadenaMatcher = DNI.matcher(cadena);
        System.out.println(cadena);
        System.out.println(cadenaMatcher.matches());
        cadena = "46396605";
        cadenaMatcher = DNI.matcher(cadena);
        System.out.println(cadena);
        System.out.println(cadenaMatcher.matches());
        System.out.println();

        //•	Guardar en un arraylist una serie de mails, pero antes de ser guardados deben cumplir con las condiciones de las expresiones regulares.
        System.out.println("Guardar en un arraylist una serie de mails, pero antes de ser guardados deben cumplir con las condiciones de las expresiones regulares.");
        ArrayList <String> listaEmails = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String email = "";
        Pattern comprobarEmail = Pattern.compile("^[A-Za-z0-9._$%-]+@[A-Za-z]+\\.[a-z]{2,3}$");
        Matcher emailMatcher = comprobarEmail.matcher(email);
        System.out.println("Ingrese la serie de mails que desea guardar, para finalizar, ingrese salir");
        while (true){
            email = sc.next();
            if(email.equals("salir")){
                break;
            }
            else{
                emailMatcher = comprobarEmail.matcher(email);
                if(emailMatcher.matches()){
                    listaEmails.add(email);
                }
                else{
                    System.out.println("La cadena ingresada no corresponde al formato de email");
                }
            }
        }
        System.out.println(listaEmails);
        System.out.println();

        //•   Comprobar si el String cadena contiene “abc”.
        System.out.println("Comprobar si el String cadena contiene “abc”.");
        Pattern contieneABC = Pattern.compile("(abc)+");
        cadena = "abcdefg";
        cadenaMatcher = contieneABC.matcher(cadena);
        System.out.println(cadena);
        System.out.println(cadenaMatcher.find());
        cadena = "aXbXc";
        cadenaMatcher = contieneABC.matcher(cadena);
        System.out.println(cadena);
        System.out.println(cadenaMatcher.find());
        cadena = "cba";
        cadenaMatcher = contieneABC.matcher(cadena);
        System.out.println(cadena);
        System.out.println(cadenaMatcher.find());
        System.out.println();

    }
}