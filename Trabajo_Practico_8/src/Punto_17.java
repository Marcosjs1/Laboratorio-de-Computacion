import java.util.Scanner;
import java.util.Arrays;
public class Punto_17 {
    public static void main(String[] args) {
        int f, c;
        System.out.print("Ingrese el número de filas de la matriz: ");
        f = leerEntero();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        c = leerEntero();

        int[][] matriz1 = crearMatriz(f, c);
        int[] valoresMinimos = new int[f];

        System.out.println("Ingrese los valores de la matriz: ");
        llenarMatriz(matriz1);

        System.out.println("La matriz es: ");
        mostrarMatriz(matriz1);

        valoresMinimos = valorMinimoPorFila(matriz1);
        System.out.println("Los valores mínimos de cada fila de la matriz son: ");
        System.out.printf(Arrays.toString(valoresMinimos));

    }

    public static int leerEntero() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    public static int[][] crearMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        return matriz;
    }

    public static void llenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i += 1) {
            for (int j = 0; j < matriz[i].length; j += 1) {
                System.out.print("Elemento [" + i + "] [" + j + "]: ");
                matriz[i][j] = leerEntero();
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
    public static int[] valorMinimoPorFila (int[][] matriz) {
        int[] valoresMin = new int[matriz.length];
        int min = matriz[0][0];
        for (int i = 0; i < matriz.length; i += 1) {
            for (int j = 0; j < matriz[i].length; j += 1) {
                if (matriz[i][j] < min);{
                    min = matriz[i][j];
                }
            }
            valoresMin[i] = min;
        }
        return valoresMin;
    }
}
