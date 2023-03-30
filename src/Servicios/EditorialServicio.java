/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Editorial;
import Persistencia.EditorialJpaController;
import Persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Cristian
 */
public class EditorialServicio {
    EditorialJpaController editorialControl;

    public EditorialServicio() {
        this.editorialControl = new EditorialJpaController();
    }

    public Editorial crearEditorial(String nombre){     
        Editorial editorial = new Editorial();
        try{
        editorial.setNombre(nombre);
        editorial.setAlta(true);
        editorialControl.create(editorial);
        return editorial;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public void eliminarEditorial(int id){
            try {
                editorialControl.destroy(id);
            } catch (NonexistentEntityException e) {
                e.printStackTrace();
            }
    }
    
    
    
}
