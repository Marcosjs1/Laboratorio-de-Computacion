import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_26 {
    public static void main(String[] args) {
        int n1, n2, i;
        int may,men;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingrese el primer número: ");
            n1 = sc.nextInt();
            System.out.print("Ingrese el segundo número: ");
            n2 = sc.nextInt();
            if (n1 == n2){System.out.println("Ingrese números distintos");}
        }
        while (n1 == n2);

        if (n1 > n2){may = n1; men = n2;}
        else {may = n2; men = n1;}

        System.out.println("Números desde "+men+" hasta "+may);
        for (i = men; i <= may; i += 1) {
            System.out.println(i);
        }
    }
}
