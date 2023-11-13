import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_8 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num = sc.nextInt();


        if (num % 2 == 0) {
            System.out.println("El número ingresado es múltiplo de dos");
        }
        if (num % 3 == 0) {
            System.out.println("El número ingresado es múltiplo de tres");
        }
    }
}
