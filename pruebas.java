public static void main(String[] args){
    Libro libro1 = new Libro("libro 1" , "autor 1", 1999, "1123141234123");
    Libro libro2 = new Libro("libro 2" , "autor 2", 1997, "119999991234123");
    Libro libro3 = new Libro("libro 3" , "autor 3", 2000, "112123");
    
    Biblioteca x = new Biblioteca();
    
    libro1.mostrarInformacion();
    libro2.mostrarInformacion();
    libro3.mostrarInformacion();

    x.agregarLibro(libro1);
    x.agregarLibro(libro2);
    x.agregarLibro(libro3);

    x.buscarLibroPorTitulo("libro 1");


    

}
