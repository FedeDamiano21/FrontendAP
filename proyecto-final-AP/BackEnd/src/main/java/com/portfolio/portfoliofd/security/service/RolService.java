
package com.portfolio.portfoliofd.security.service;

import com.portfolio.portfoliofd.security.entity.Rol;
import com.portfolio.portfoliofd.security.enums.RolNombre;
import com.portfolio.portfoliofd.security.repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
       return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
