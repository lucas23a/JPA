/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g13.e01;

import Entidades.Autor;
import Entidades.Editorial;
import Servicios.AutorServicio;
import Servicios.EditorialServicio;
import Servicios.LibroServicio;

public class G13E01 {

    public static void main(String[] args) {
         AutorServicio autor = new AutorServicio();
    /*   
        Autor a1 = new Autor();
        Autor a2 = new Autor();
        EditorialServicio editorial = new EditorialServicio();
        Editorial e1 = new Editorial();
        Editorial e2 = new Editorial();

        LibroServicio libro1 = new LibroServicio();
        LibroServicio libro2 = new LibroServicio();

        //Crear autores
        a1 = autor.crearAutor("Stephen R. Covey");
        a2 = autor.crearAutor("Robert Greene");
        //Crear editoriales
        e1=editorial.crearEditorial("boocket");
        e2=editorial.crearEditorial("Oceano");
        //Crear libros
        libro1.crearLibro("Los 7 habitos", 2016, 10, 9, 1, true, a1, e1);
        libro2.crearLibro("La ley50", 2005, 5, 3, 2, true, a2, e2);*/

        //Buscar autor por nombre
        Autor a3 = autor.buscarPorNombre("Robert Greene");
        System.out.println(a3);
        System.out.println(" ");
        
        //Buscar libro por ISBN
        LibroServicio libro3= new LibroServicio();
        libro3.buscarLibroPorISBN(1);
        System.out.println("");
        
        //Buscar libro por titulo
        LibroServicio libro4= new LibroServicio();
        libro4.buscarLibroPorTitulo("La ley50");
        System.out.println("");
        
        //Buscar libro por nombre de autor
        LibroServicio libro5= new LibroServicio();
        libro5.buscarPorAutor("Stephen R. Covey");
        System.out.println("");
        
        //Buscar libro por editorial
        LibroServicio libro6= new LibroServicio();
        libro6.buscarPorEditorial("Oceano");
        System.out.println("");
        
    }

    
    
}
