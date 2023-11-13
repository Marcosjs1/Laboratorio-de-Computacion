import java.util.Scanner;
import java.util.Arrays;
public class Punto_13 {
    public static void main(String[] args) {
        int f, c;

        System.out.print("Ingrese el número de filas de la matriz: ");
        f = leerEntero();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        c = leerEntero();

        int[][] matriz1 = crearMatriz(f, c);

        System.out.println("Ingrese los valores de la matriz: ");
        llenarMatriz(matriz1);

        System.out.println("La matriz es: ");
        mostrarMatriz(matriz1);

        System.out.print("Ingrese el número que desea contar en la matriz: ");
        int numero = leerEntero();

        int ocurrencia = contarOcurrencia(matriz1, numero);
        System.out.println("El número "+numero+" aparece "+ocurrencia+" veces en la matriz");
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

    public static int contarOcurrencia (int[][] matriz, int num) {
        int numEnMatriz = 0;
        for (int i = 0; i < matriz.length; i += 1) {
            for (int j = 0; j < matriz[i].length; j += 1) {
                if (matriz[i][j] == num){
                    numEnMatriz ++;
                }
            }
        }
        return numEnMatriz;
    }
}
