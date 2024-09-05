import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String isbn;

    public Libro(String titulo, String autor, int añopublicacion, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añopublicacion;
        this.isbn = isbn;
    }

    public void mostrarInformacion(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año de publicación: " + this.añoPublicacion);
        System.out.println("Isbn: " + this.isbn + "\n");
    }

    public String getTitulo(){
        return titulo;
    }

    public boolean esAntiguo(){
        int añoActual = LocalDate.now().getYear();

        if(añoActual - this.añoPublicacion > 20){
            return true; 
        } else{
            return false;
        }
    }
}
