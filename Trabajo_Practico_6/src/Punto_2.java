import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_2 {
    public static void main(String[] args) {
        int cantPar = 0, i;
        double promPar = 0;
        double[] nums = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        for (i = 0; i <= 9;  i = i + 1){
            nums[i] = sc.nextDouble();
            System.out.println("Introduzca otro número: ");
        }
        for (i = 0; i <= 9;  i = i + 1){
            if (i % 2 == 0 || i == 0){
                cantPar += 1;
                promPar += nums[i];
            }
        }
        promPar = promedio(promPar, cantPar);
        System.out.println("El promedio de los números ingresados en las posiciones pares del array es: "+promPar);
    }
    public static double promedio (double a, int b){
        if (b == 0){
            return 0;
        }
        else {
            double c;
            c = a / b;
            return c;
        }
    }
}
