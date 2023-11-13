import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_6 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca otro número: ");
        num2 = sc.nextInt();

        if (num1%10 == num2%10) {
            System.out.println("La última cifra de ambos números es igual");
        }
        else {
            System.out.println("La última cifra de ambos números es distinta");
        }
    }
}

