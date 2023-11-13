import java.util.Scanner;
public class CuentaBancaria {
    Scanner sc = new Scanner(System.in);
    private double saldo;
    private int numeroCuenta;
    public CuentaBancaria(double saldo, int numeroCuenta){
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }
    public void infoCuentaBancaria(){
        System.out.println("Saldo: $"+saldo);
        System.out.println("Número de cuenta: "+numeroCuenta);
    }
    public void retirarDinero(){
        System.out.print("Ingrese la cantidad de dinero que desea retirar: $");
        double retirar = sc.nextDouble();
        saldo -= retirar;
        System.out.println("Usted a retirado $"+retirar+" su saldo actual es de: "+saldo);
    }
    public void depositarDinero(){
        System.out.print("Ingrese la suma de dinero que desea depositar: ");
        double depositar = sc.nextDouble();
        saldo += depositar;
        System.out.println("Usted a depositado $"+depositar+" su saldo actual es de: "+saldo);
    }
    public static void main(String [] args){
        CuentaBancaria cuenta1 = new CuentaBancaria(5000, 20431);
        cuenta1.infoCuentaBancaria();
        cuenta1.retirarDinero();
        cuenta1.depositarDinero();
    }
}
