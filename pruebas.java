public static void main(String[] args){
    Autor autor1 = new Autor(1234, "Diego Bejarano", "diego.bejarano@uabc.edu.mx");
    Autor autor2 = new Autor(1234, "Bruno Palma", "bruno.palma@uabc.edu.mx");
    Autor autor3 = new Autor(1234, "Emiliano Burgueño", "emiliano.burgueno@uabc.edu.mx");

    Libro libro1 = new Libro("libro 1" , autor1, 1999, "1123141234123", false);
    Libro libro2 = new Libro("libro 2" , autor2, 1997, "119999991234123", true);
    Libro libro3 = new Libro("libro 3" , autor3, 2000, "112123", true );
    
    Biblioteca x = new Biblioteca();

    x.agregarLibro(libro1);
    x.agregarLibro(libro2);
    x.agregarLibro(libro3);

    System.out.println(x.listarLibros());
    System.out.println("\n" + "Libros prestados: " + x.librosPrestado() + "\n");


    

}
