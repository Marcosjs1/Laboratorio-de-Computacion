import java.util.Scanner;
import java.util.Arrays;
public class Punto_7 {
    public static void main(String[] args) {
        int f, c;
        int [] maxPos = new int[3];
        int max;
        String pos;

        System.out.print("Ingrese el número de filas de la matriz: ");
        f = leerEntero();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        c = leerEntero();

        int[][] matriz1 = crearMatriz(f, c);

        System.out.println("Ingrese los valores de la matriz: ");
        llenarMatriz(matriz1);

        System.out.println("La matriz es: ");
        mostrarMatriz(matriz1);

        maxPos = elementoMax(matriz1);
        max = maxPos[0];
        pos = "["+maxPos[1]+"] ["+maxPos[2]+"]";

        System.out.print("El elemento máximo de la matriz es: "+max+" en la posición: "+pos);
    }
    public static int leerEntero(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
    public static int[][] crearMatriz(int filas, int columnas){
        int[][] matriz = new int[filas][columnas];
        return matriz;
    }
    public static void llenarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i += 1){
            for (int j = 0; j < matriz[i].length; j += 1){
                System.out.print("Elemento ["+i+"] ["+j+"]: ");
                matriz[i][j] = leerEntero();
            }
        }
    }
    public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i += 1){
            for (int j = 0; j < matriz[i].length; j += 1){
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] elementoMax(int[][] matriz) {
        int [] resultado = new int[3];
        resultado[0] = 0;
        for (int i = 0; i < matriz.length; i += 1) {
            for (int j = 0; j < matriz[i].length; j += 1) {
                if (matriz[i][j] > resultado[0]) {
                    resultado[0] = matriz[i][j];
                    resultado[1] = i;
                    resultado[2] = j;
                }
            }
        }
        return resultado;
    }
}
