
package com.portafolio.Simba.Interface;

import com.portafolio.Simba.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una persona
    public List<Persona> getPersona();
    
    //Guardar objeto tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar objeto por ID
    public void deletePersona(Long id);
    
    //Buscar Persona por id
    public Persona findPersona(Long id);
}
