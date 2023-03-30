
package Servicios;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistencia.LibroJpaController;

public class LibroServicio {
    LibroJpaController libroControl;

    public LibroServicio() {
        libroControl= new LibroJpaController();
    }
    
    public Libro crearLibro(String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, boolean alta, Autor autor, Editorial editorial){
        Libro book = new Libro();
        try {
            book.setTitulo(titulo);
            book.setAnio(anio);
            book.setEjemplares(ejemplares);
            book.setEjemplaresPrestados(ejemplaresPrestados);
            book.setEjemplaresRestantes(ejemplaresRestantes);
            book.setAlta(alta);
            book.setAutor(autor);
            book.setEditorial(editorial);
            libroControl.create(book);
            return book;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void eliminarLibro(long isbn){
        try {
            libroControl.destroy(isbn);
        } catch (Exception e) {
        }
    }
        
    public Libro buscarLibroPorISBN(long isbn){
        try {
            Libro lib1= libroControl.findLibro(isbn);
            System.out.println(lib1);
            return lib1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
            
        }      
    }
    
    public Libro buscarLibroPorTitulo(String titulo){
        try {
            Libro lib1= libroControl.buscarPorTitulo(titulo);
            System.out.println(lib1);
            return lib1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Libro buscarPorAutor (String autor){
        try {
            Libro lib1= libroControl.buscarPorAurtor(autor);
            System.out.println(lib1);
            return lib1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
    }
    }
    
    public Libro buscarPorEditorial (String editorial){
        try {
            Libro lib1= libroControl.buscarPorEditorial(editorial);
            System.out.println(lib1);
            return lib1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}

