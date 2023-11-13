import java.util.Scanner;
import java.util.Arrays;
public class Punto_16 {
    public static void main(String[] args) {
        int f, c;

        System.out.print("Ingrese el número de filas de la matriz: ");
        f = leerEntero();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        c = leerEntero();

        int[][] matriz1 = crearMatriz(f, c);

        System.out.println("Ingrese los valores de la matriz: ");
        llenarMatriz(matriz1);

        int[][] matrizT = crearMatrizTranspuesta(matriz1);
        int[][] matrizInv = crearMatrizInversa(matriz1);

        System.out.println("La matriz es: ");
        mostrarMatriz(matriz1);

        System.out.println("La matriz inversa es: ");
        mostrarMatriz(matrizInv);

        System.out.println("La matriz transpuesta es: ");
        mostrarMatriz(matrizT);
        if (matrizEsOrtogonal(matrizT, matrizInv)){
            System.out.println("La matriz es ortogonal");
        }
        else{System.out.println("La matriz no es ortogonal");}

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

    public static int[][] crearMatrizTranspuesta(int[][] matriz){
        int [][] matrizTranspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i += 1){
            for (int j = 0; j < matriz[i].length; j += 1){
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTranspuesta;
    }
    public static int[][] crearMatrizInversa(int[][] matriz){
        int [][] matrizInversa = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i += 1){
            for (int j = 0; j < matriz[i].length; j += 1){
                matrizInversa[i][j] = matriz[matriz.length-1-i][matriz[i].length-1-j];
            }
        }
        return matrizInversa;
    }
    public static boolean matrizEsOrtogonal(int[][]matrizTranspuesta, int[][]matrizInversa){
        boolean ortogonal = true;
        for (int i = 0; i < matrizTranspuesta.length; i += 1){
            for (int j = 0; j < matrizTranspuesta[i].length; j += 1){
                if (matrizTranspuesta[i][j] != matrizInversa[i][j]){
                    ortogonal = false;
                }
            }
        }
        return ortogonal;
    }
}
