import java.util.ArrayList;
import java.util.Scanner;
public class Factura {
    private int numeroDeFactura;
    private String fechaDeEmision;
    private String cliente;
    private ArrayList <String> articulos;
    private ArrayList <Double> precioUnitario;
    private ArrayList <Integer> cantidad;
    private double subtotal;
    private double IVA;
    private double total;
    public Factura (int numeroDeFactura, String fechaDeEmision, String cliente, ArrayList <String> articulos, ArrayList <Double> precioUnitario, ArrayList <Integer> cantidad, double subtotal, double IVA, double total){
        this.numeroDeFactura = numeroDeFactura;
        this.fechaDeEmision = fechaDeEmision;
        this.cliente =cliente;
        this.articulos = articulos;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.IVA = IVA;
        this.total = total;
    }
    public void agregarArticulo(){
        Scanner sc = new Scanner(System.in);
        String articulo;
        double precio;
        int cantidadArticulo;
        System.out.print("Ingrese el artículo que desea agregar a la factura: ");
        articulo = sc.nextLine();
        articulos.add(articulo);

        System.out.print("Ingrese el precio por unidad del artículo: ");
        precio = sc.nextDouble();
        precioUnitario.add(precio);

        System.out.print("Ingrese la cantidad vendida del artículo: ");
        cantidadArticulo = sc.nextInt();
        cantidad.add(cantidadArticulo);
    }
    public double calcularSubtotal(){
        double subtotal= 0;
        for (int i = 0; i < precioUnitario.size(); i++) {
            subtotal += precioUnitario.get(i) * cantidad.get(i);
        }
        return subtotal;
    }
    public double calcularIVA(){
        return calcularSubtotal() * (IVA / 100);
    }
    public double calcularTotal(){
        return calcularSubtotal() + calcularIVA();
    }
    public static void main (String [] args){
        Factura factura1 = new Factura(1,"03/09/2023","Alexis Ramiz",new ArrayList<String>(){{add("Tenedor");}}, new ArrayList<Double>(){{add(316.23);}}, new ArrayList<Integer>(){{add(6);}},0,21,0);
        factura1.agregarArticulo();
        System.out.println("El total de la factura sin impuestos es: $"+factura1.calcularSubtotal());
        System.out.println("El total final de la factura con un impuesto del "+factura1.IVA+"% es: $"+String.format("%.2f", factura1.calcularTotal()));
    }
}
