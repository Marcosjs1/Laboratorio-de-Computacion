public class Libro {
    private String titulo;
    private String autor;
    private int añoDePublicación;
    public Libro(String titulo, String autor, int añoDePublicación){
        this.titulo = titulo;
        this.autor = autor;
        this.añoDePublicación = añoDePublicación;
    }
    public void infoLibro(){
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Año de publicación: "+añoDePublicación);
    }
    public static void main(String [] args){
        Libro lib1 = new Libro("Fahrenheit 451", "Ray Bradbury", 1953);
        lib1.infoLibro();
    }
}
