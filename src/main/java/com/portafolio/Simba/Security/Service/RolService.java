
package com.portafolio.Simba.Security.Service;

import com.portafolio.Simba.Security.Entity.Rol;
import com.portafolio.Simba.Security.Enums.RolNombre;
import com.portafolio.Simba.Security.Repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository irolReposiory;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolReposiory.findByRolNombre(rolNombre);
    }
    
    public void saveRol(Rol rol){
        irolReposiory.save(rol);
    }
}
