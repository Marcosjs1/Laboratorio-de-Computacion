import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Programa Java que lea un número entero por teclado y calcule si es par o impar.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número ingresado es par");
        }
        else {
            System.out.println("El número ingresado es impar");
        }
    }
}

