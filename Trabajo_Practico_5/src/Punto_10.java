import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_10 {
    public static void main(String[] args) {
        String car1, car2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una letra: ");
        car1 = sc.nextLine();
        System.out.println("Introduzca otra letra: ");
        car2 = sc.nextLine();
        if (car1 == car1.toLowerCase() && car2 == car2.toLowerCase()) {
            System.out.println("Ambas letras ingresadas están en minúsculas");
        }
        else{
            System.out.println("Ninguna o una de las letras ingresadas están en minúsculas");
        }
    }
}
