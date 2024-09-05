import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    
    public Biblioteca(){
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void mostrarLibros(){    
        for(Libro x : this.libros){
            x.mostrarInformacion();
        }
    }

    public void buscarLibroPorTitulo(String Titulo){
        for(Libro x : this.libros){
            if(x.getTitulo().equals(Titulo)){
                System.out.println("Se ha encontrado: " + x.getTitulo());
            }
        }
    } 
    
}

