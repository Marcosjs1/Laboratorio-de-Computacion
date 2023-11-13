import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_14 {
    public static void main(String[] args) {
        int num, largo;
        String numS;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número de tres cifras: ");
        num = sc.nextInt();
        numS = Integer.toString(num);
        largo = numS.length();
        if (largo == 3){
            if (num/100 == num%10){
                System.out.println("El número ingresado es capicúa");
            }
            else{
                System.out.println("El número ingresado no es capicúa");
            }
        }
        else{
            System.out.println("El número ingresado no es de 3 cifras");
        }
    }
}
