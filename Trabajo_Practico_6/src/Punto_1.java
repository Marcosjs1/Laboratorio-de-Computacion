import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_1 {
    public static void main(String[] args) {
        int cantP = 0, cantN = 0, i;
        double promP = 0, promN = 0;
        double[] nums = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        for (i = 0; i <= 9;  i = i + 1){
            nums[i] = sc.nextDouble();
            System.out.println("Introduzca otro número: ");
        }
        for (i = 0; i <= 9;  i = i + 1){
            if (nums[i] < 0){
                cantN += 1;
                promN += nums[i];
            }
            else{
                cantP += 1;
                promP += nums[i];
            }
        }
        promN = promedio(promN, cantN);
        promP = promedio(promP, cantP);
        System.out.println("El promedio de los números positivos ingresados es: "+promP);
        System.out.println("El promedio de los números negativos ingresados es: "+promN);
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
