import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_4 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca otro número: ");
        num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Los números ingresados son iguales");
        }
        else {
            System.out.println("Los números ingresados son diferentes");
        }
    }
}
