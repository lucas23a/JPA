
package Servicios;

import Entidades.Autor;
import Persistencia.AutorJpaController;

public class AutorServicio {
    private AutorJpaController autorControl;

    public AutorServicio() {
        this.autorControl= new AutorJpaController();
    }
    
    public Autor crearAutor(String nombre){
        Autor autor = new Autor();
            try {
            autor.setNombre(nombre);
            autor.setAlta(true);
            autorControl.create(autor);
            return autor;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }        
    }
    
    public void eliminarAutor(int id){
        try {
            autorControl.destroy(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Autor buscarPorNombre(String nombre){     
        Autor autor;
        try {
          autor= autorControl.buscarAutorxNombre(nombre);
          return autor;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
}
