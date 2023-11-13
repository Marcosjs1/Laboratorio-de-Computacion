// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// Declaración e inicialización

// 1.	Declarar un array de 10 enteros y inicializarlo con los valores de los 10 primeros números naturales.
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i <= array.length-1; i++){
            array[i] = i+1;
        }
        System.out.println("Los elementos del array son:");
        System.out.println(Arrays.toString(array));
    }
}

// 2.	Declarar un array de 10 números reales y inicializarlo con los valores de los 10 primeros números primos.
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int num = 2;
        double[] array = new double[10];
        for (int i = 0; i <= array.length-1; i++){
            if (num == 2 || num == 3 || num == 5){
                array[i] = num;
            }
            else{
                if (num % 1 == 0 && num % num == 0 && num % 2 != 0 && num % 3 != 0 && num % 5 != 0){
                    array[i] = num;
                }
                else{
                    i--;
                }
            }
            num ++;
        }
        System.out.println("Los elementos del array son:");
        System.out.println(Arrays.toString(array));
    }
}

// 3.	Declarar un array bidimensional de 10 filas y 10 columnas de números enteros.
public class Main {
    public static void main(String[] args) {
        int num = 1;
        int[][] matriz = new int[10][10];
        for (int i = 0; i <= matriz.length-1; i++){
            for (int j = 0; j <= matriz[i].length-1; j++){
                matriz[i][j] = num;
                num ++;
            }
        }
        System.out.println("Los elementos del array son:");
        for (int i = 0; i < matriz.length; i += 1){
            for (int j = 0; j < matriz[i].length; j += 1){
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}

// 4.	Declarar un array multidimensional de 3 dimensiones de números reales.
public class Main {
    public static void main(String[] args) {
        int num = 1;
        int[][][] array3D = new int[3][2][5];
        for (int i = 0; i <= array3D.length-1; i++){
            for (int j = 0; j <= array3D[i].length-1; j++){
                for (int k = 0; k <= array3D[i][j].length-1; k++){
                    array3D[i][j][k] = num;
                    num ++;
                }
            }
        }
        System.out.println("Los elementos del array son:");
        for (int i = 0; i <= array3D.length-1; i++){
            for (int j = 0; j <= array3D[i].length-1; j++){
                for (int k = 0; k <= array3D[i][j].length-1; k++){
                    System.out.print("\t"+array3D[i][j][k]);
                }
                System.out.println("\n");
            }
            System.out.println("\n");
        }
    }
}


// Lectura y escritura

// 1.	Ingresar por teclado los valores de un array de 10 enteros.
import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(i+1+"- ");
            array[i] = sc.nextInt();
        }
        System.out.println("Los elementos del array son:");
        System.out.println(Arrays.toString(array));
    }
}

// 2.	Ingresar por teclado los valores de un array de 10 números reales.
import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double[] array = new double[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(i+1+"- ");
            array[i] = sc.nextDouble();
        }
        System.out.println("Los elementos del array son:");
        System.out.println(Arrays.toString(array));
    }
}

// 3.	Leer los datos de un array de caracteres y mostrarlos por pantalla.
import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char[] array = new char[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(i+1+"- ");
            array[i] = sc.next().charAt(0);
        }
        System.out.println("Los elementos del array son:");
        System.out.println(Arrays.toString(array));
    }
}

// 4.	Leer los datos de un array de booleanos y mostrarlos por pantalla.
import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean[] array = new boolean[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(i+1+"- ");
            array[i] = sc.nextBoolean();
        }
        System.out.println("Los elementos del array son:");
        System.out.println(Arrays.toString(array));
    }
}

// Operaciones aritméticas

// 1.	Sumar los elementos de un array de 10 enteros.
import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int suma = 0;
        int[] array = new int[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(i+1+"- ");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i <= array.length-1; i++){
            suma += array[i];
        }
        System.out.println("Los elementos del array son:");
        System.out.println(Arrays.toString(array));
        System.out.println("La suma de los elementos del array es: "+suma);
    }
}

// 2.	Multiplicar los elementos de un array de 10 números reales.
import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mult;
        int[] array = new int[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(i+1+"- ");
            array[i] = sc.nextInt();
        }
        mult = array[0];
        for (int i = 1; i <= array.length-1; i++){
            mult = mult * array[i];
        }
        System.out.println("Los elementos del array son:");
        System.out.println(Arrays.toString(array));
        System.out.println("La multiplicación de los elementos del array es: "+mult);
    }
}

// 3.	Ordenar un array de 10 enteros de menor a mayor.
import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(i+1+"- ");
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("El array ordenado de menor a mayor es: ");
        System.out.println(Arrays.toString(array));
    }
}

// 4.	Ordenar un array de 10 cadenas de forma alfabética.
import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char[] array = new char[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(i+1+"- ");
            array[i] = sc.next().charAt(0);
        }
        Arrays.sort(array);
        System.out.println("El array en orden alfabético es: ");
        System.out.println(Arrays.toString(array));
    }
}

// Ejercicios adicionales

// 1.	Implementar un método que cuente el número de elementos pares en un array de enteros.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(i+1+"- ");
            array[i] = sc.nextInt();
        }
        System.out.println("El array contiene "+contarPares(array)+" números pares");
    }
    public static int contarPares (int[] A){
        int pares = 0;
        for (int i = 0; i <= A.length-1; i++){
            if (A[i] % 2 == 0){
                pares++;
            }
        }
        return pares;
    }
}

// 2.	Implementar un método que cuente el número de elementos mayores que 10 en un array de números reales.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double[] array = new double[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(i+1+"- ");
            array[i] = sc.nextDouble();
        }
        System.out.println("El array contiene "+mayoresQue10(array)+" números mayores a 10");
    }
    public static int mayoresQue10 (double[] A){
        int mayorA10 = 0;
        for (int i = 0; i <= A.length-1; i++){
            if (A[i] > 10){
                mayorA10++;
            }
        }
        return mayorA10;
    }
}

// 3.	Implementar un método que calcule la suma de los elementos de un array de enteros que sean múltiplos de 3.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(i+1+"- ");
            array[i] = sc.nextInt();
        }
        System.out.println("La suma de los elementos que son múltiplos de 3 del array es: "+sumamult3(array));
    }
    public static int sumamult3 (int[] A){
        int suma = 0;
        for (int i = 0; i <= A.length-1; i++){
            if (A[i] % 3 == 0){
                suma += A[i];
            }
        }
        return suma;
    }
}

// 4.	Implementar un método que encuentre el elemento máximo de un array de enteros.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(i+1+"- ");
            array[i] = sc.nextInt();
        }
        System.out.println("El número más grande del array es: "+max(array));
    }
    public static int max (int[] A){
        int max = 0;
        for (int i = 0; i <= A.length-1; i++){
            if (A[i] > max){
                max = A[i];
            }
        }
        return max;
    }
}

// 5.	Implementar un método que encuentre el elemento mínimo de un array de cadenas.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char[] array = new char[10];
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(i+1+"- ");
            array[i] = sc.next().charAt(0);
        }
        System.out.println("El elemento mínimo de el array es: "+min(array));
    }
    public static char min (char[] A){
        int min = A[0];
        for (int i = 0; i <= A.length-1; i++){
            if (A[i] < min){
                min = A[i];
            }
        }
        return (char) min;
    }
}

// 6.	Implementar un método que copie un array de enteros a otro array de enteros.
import java.util.Arrays;
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arrayCopia;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese los elementos del array: ");
        for (int i = 0; i <= array.length-1; i++){
            System.out.print(i+1+"- ");
            array[i] = sc.nextInt();
        }
        arrayCopia = copiarArray(array);
        System.out.println("Se ha copiado el array: ");
        System.out.println(Arrays.toString(arrayCopia));
    }
    public static int[] copiarArray (int[] A){
        int[] copia;
        copia = A.clone();
        return copia;
    }
}