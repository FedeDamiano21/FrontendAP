package com.portfolio.portfoliofd.controller;


import com.portfolio.portfoliofd.entity.Persona;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {
    

    
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas (){
        //return persoServ.verPersonas();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        //persoServ.borrarPersona(id);
    }
    
    
}
