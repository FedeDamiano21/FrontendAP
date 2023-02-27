
package com.portfolio.portfoliofd.service;

import com.portfolio.portfoliofd.entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //traer una lista de persona
    public List<Persona> verPersona ();
    
    //guardar un objeto de tipo persona
    public void crearPersona (Persona per);
    
    //Eliminar una persona por id
    public void borrarPersona (Long id);
    
    //Buscar una persona por id
    public Persona buscarPersona (Long id);
}
