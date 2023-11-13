import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_3 {
    public static void main(String[] args) {
        int cantAlumnos;
        double promNotaAlumnos = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de alumnos de la clase: ");
        cantAlumnos = sc.nextInt();
        double[] notasAlumnos = new double[cantAlumnos];
        System.out.println("Ingrese las notas de los alumnos: ");
        for (int i = 0; i <= cantAlumnos-1; i += 1){
            System.out.print((i+1)+ "°: ");
            notasAlumnos[i] = sc.nextDouble();
        }
        for (int i = 0; i <= cantAlumnos-1; i += 1){
            promNotaAlumnos += notasAlumnos[i];
        }
        promNotaAlumnos = promNotaAlumnos / cantAlumnos;
        System.out.println("La nota promedio de la clase es: "+String.format("%.2f", promNotaAlumnos));
        System.out.println("Las notas por encima del promedio: ");
        for (int i = 0; i <= cantAlumnos-1; i +=1){
            if (notasAlumnos[i] >= promNotaAlumnos){
                System.out.println((i+1)+"°: "+notasAlumnos[i]);
            }
        }
    }
}
