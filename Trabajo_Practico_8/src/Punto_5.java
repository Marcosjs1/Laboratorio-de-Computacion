import java.util.Scanner;
import java.util.Arrays;
public class Punto_5 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los números del array: ");
        for (int i = 0; i <= nums.length-1;  i = i + 1){
            nums[i] = sc.nextInt();
        }
        System.out.print("Introduzca el número por el que multiplicara al array: ");
        num = sc.nextInt();
        System.out.println("El producto escalar del array es: "+productoEscalar(nums, num));
    }
    public static int productoEscalar (int[] array, int multiplicador){
        int prodEscalar = 0;
        for (int i = 0; i <= array.length-1; i += 1){
            array[i] = array[i] * multiplicador;
            prodEscalar += array[i];
        }
        return prodEscalar;
    }
}
