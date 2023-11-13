import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_3 {
    public static void main(String[] args) {
        String letra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una letra: ");
        letra = sc.nextLine();
        if (letra == letra.toUpperCase()) {
            System.out.println("La letra ingresada está en mayúsculas");
        } else {
            System.out.println("La letra ingresada no está en mayúsculas");
        }
    }
}