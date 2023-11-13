import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_7 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num = sc.nextInt();


        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("El número ingresado es múltiplo de tres y de cinco");
        }
        if (num % 3 == 0 && num % 5 != 0){
            System.out.println("El número ingresado es múltiplo de tres pero no de cinco");
        }
        if (num % 3 != 0 && num % 5 == 0){
            System.out.println("El número ingresado es múltiplo de cinco pero no de tres");
        }
        if (num % 3 != 0 && num % 5 != 0) {
            System.out.println("El número ingresado no es múltiplo de tres ni de cinco");
        }
    }
}
