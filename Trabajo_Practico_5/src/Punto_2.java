import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_2 {
 public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca un número: ");
    num = sc.nextInt();
    if (num % 10 == 0) {
        System.out.println("El número ingresado es múltiplo de 10");
    }
    else {
        System.out.println("El número ingresado no es múltiplo de 10");
    }
}
}
