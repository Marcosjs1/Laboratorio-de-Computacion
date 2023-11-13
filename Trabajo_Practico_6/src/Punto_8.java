import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Punto_8 {
    public static void main(String[] args) {
        int cantEmpleados = 20, posMayorSueldo = 0;
        double mayorSueldo = 0;
        String[] nombreEmpleados = new String[cantEmpleados];
        double[] sueldoEmpleados = new double[cantEmpleados];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de los empleados: ");
        for (int i = 0; i <= cantEmpleados-1; i += 1){
            System.out.print((i+1)+"- ");
            nombreEmpleados[i] = sc.nextLine();
        }
        System.out.println("Ingrese el sueldo de los empleados: ");
        for (int i = 0; i <= cantEmpleados-1; i += 1){
            System.out.print(nombreEmpleados[i]+": $");
            sueldoEmpleados[i] = sc.nextDouble();
            if (sueldoEmpleados[i] > mayorSueldo){
                mayorSueldo = sueldoEmpleados[i];
                posMayorSueldo = i;
            }
        }
        System.out.println("El empleado que más sueldo gana es "+nombreEmpleados[posMayorSueldo]+" con un sueldo de $"+mayorSueldo);
    }
}
