import java.time.LocalDate;

public class Libro {
    private String titulo;
    private Autor autor;
    private int añoPublicacion;
    private String isbn;
    private boolean prestado;

    public Libro(String titulo, Autor autor, int añopublicacion, String isbn, boolean prestado){
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añopublicacion;
        this.isbn = isbn;
        this.prestado = prestado;
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

    //@Override
    public String toString(){
        return "Titulo: " + titulo + "\n" + "Id autor: " + autor.getId() + "\n" + "Nombre autor: " + autor.getNombreAutor() + "\n" + "Correo autor:  " + autor.getCorreoElectronico() + "\n" + "Año publicacion: " + String.valueOf(añoPublicacion) + "\n" + "Clave isbn: " + isbn + "\n" + "Libro prestado: " + prestado + "\n";
    }

    public boolean getPrestado(){
        return prestado;
    }
}
