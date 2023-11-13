import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_9 {
    public static void main(String[] args) {
        String car1, car2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un caracter: ");
        car1 = sc.nextLine();
        System.out.println("Introduzca otro caracter: ");
        car2 = sc.nextLine();
        if (car1.equals(car2)) {
            System.out.println("Los caracteres ingresados son iguales");
        }
        else{
            System.out.println("Los caracteres ingresados son distintos");
        }
    }
}
