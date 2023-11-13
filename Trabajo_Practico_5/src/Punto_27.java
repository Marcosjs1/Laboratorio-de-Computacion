import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_27 {
    public static void main(String[] args) {
        int A, B, i;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingrese el primer número: ");
            A = sc.nextInt();
            System.out.print("Ingrese el segundo número: ");
            B = sc.nextInt();
            if (A > B){System.out.println("El primer número debe ser menor al segundo");}
        }
        while (A > B);

        System.out.println("Números pares desde "+A+" hasta "+B);
        for (i = A; i <= B; i += 1) {
            if (i % 2 == 0){System.out.println(i);}
        }
    }
}
