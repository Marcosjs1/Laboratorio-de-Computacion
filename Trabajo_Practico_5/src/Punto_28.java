import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_28 {
    public static void main(String[] args) {
        int N, M, i;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingrese el primer número: ");
            N = sc.nextInt();
            System.out.print("Ingrese el segundo número: ");
            M = sc.nextInt();
            if (N > M){System.out.println("El primer número debe ser menor al segundo");}
            if (N < 0 || M < 0){System.out.println("Ingrese solo números positivos");}
        }
        while (N < 0 || M < 0 || N > M);

        System.out.println("Números múltiplos de "+N+" desde 1 hasta "+M);
        for (i = 1; i <= M; i += 1) {
            if (i % N == 0){System.out.println(i);}
        }
    }
}
