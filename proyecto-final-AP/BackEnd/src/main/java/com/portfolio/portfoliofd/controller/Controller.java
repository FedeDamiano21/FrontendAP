package com.portfolio.portfoliofd.controller;

import com.portfolio.portfoliofd.entity.Persona;
import com.portfolio.portfoliofd.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
@CrossOrigin(origins = "*")
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersona(){
        return persoServ.verPersona();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public String borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
        return "La persona fue eliminada";
    }
    
    @GetMapping ("/buscar/perfil")
    public Persona buscarPersona(){
        return persoServ.buscarPersona((long)1);    
    }
    
  
    
}
