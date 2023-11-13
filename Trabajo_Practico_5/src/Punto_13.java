import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_13 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("El año ingresado es bisiesto");
        }
        else {
            System.out.println("El año ingresado no es bisiesto");
        }
    }
}
