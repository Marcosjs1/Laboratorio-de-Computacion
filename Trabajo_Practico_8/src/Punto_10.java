import java.util.Scanner;
import java.util.Arrays;
public class Punto_10 {
    public static void main(String[] args) {
        int tam;
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        tam = leerEntero();

        int[][] matriz1 = crearMatrizCuadrada(tam);

        llenarMatrizIdentidad(matriz1);

        System.out.println("La matriz identidad es: ");
        mostrarMatriz(matriz1);
    }

    public static int leerEntero() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    public static int[][] crearMatrizCuadrada(int n) {
        int[][] matriz = new int[n][n];
        return matriz;
    }

    public static void llenarMatrizIdentidad(int[][] matriz) {
        for (int i = 0; i < matriz.length; i += 1) {
            for (int j = 0; j < matriz[i].length; j += 1) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i += 1) {
            for (int j = 0; j < matriz[i].length; j += 1) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
