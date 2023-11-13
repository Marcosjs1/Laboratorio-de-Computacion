import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_5 {
    public static void main(String[] args) {
        int cantPos = 0, cantNeg = 0, cantCeros = 0;
        double[] nums = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los números del array: ");
        for (int i = 0; i <= 9; i += 1) {
            System.out.print((i + 1) + "- ");
            nums[i] = sc.nextDouble();
        }
        for (int i = 0; i <= 9; i += 1) {
            if (nums[i] == 0) {cantCeros += 1;}
            if (nums[i] > 0) {cantPos += 1;}
            if (nums[i] < 0) {cantNeg += 1;}
        }
        System.out.println("Cantidad de números positivos del array: "+cantPos);
        System.out.println("Cantidad de números negativos del array: "+cantNeg);
        System.out.println("Cantidad de ceros en el array: "+cantCeros);
    }
}
