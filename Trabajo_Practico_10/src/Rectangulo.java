public class Rectangulo {
    private double ancho;
    private double alto;
    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }
    public void mostrarRectanculo(){
        System.out.println("Ancho: "+ancho);
        System.out.println("Alto: "+alto);
    }
    public void calcularArea(){
        double area = ancho * alto;
        System.out.println("El área del rectángulo es: "+area);
    }
    public void calcularPerimetro(){
        double perimetro = 2*(ancho + alto);
        System.out.println("El perímetro del rectángulo es: "+perimetro);
    }
    public static void main(String [] args){
        Rectangulo rect1 = new Rectangulo(5.63, 7.17);
        rect1.mostrarRectanculo();
        rect1.calcularArea();
        rect1.calcularPerimetro();
    }
}
