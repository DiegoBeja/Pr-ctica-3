import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Libro> librosPrestados;
    private List<String> librosBiblioteca;
    
    public Biblioteca(){
        this.libros = new ArrayList<>();
        this.librosPrestados = new ArrayList<>();
        this.librosBiblioteca = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);

    }

    public List<String> listarLibros(){
        librosBiblioteca.clear();

        for(Libro i : libros){
            librosBiblioteca.add(i.toString() + "\n");
        }
        return librosBiblioteca; 
    }

    public void buscarLibroPorTitulo(String Titulo){
        for(Libro x : this.libros){
            if(x.getTitulo().equals(Titulo)){
                System.out.println("Se ha encontrado: " + x.getTitulo());
            }
        }
    } 

    public ArrayList<Libro> librosPrestado(){
        for(Libro i : this.libros){
            if(i.getPrestado() == true){
                librosPrestados.add(i);
            }
        }

        return librosPrestados;
    }
    
}

