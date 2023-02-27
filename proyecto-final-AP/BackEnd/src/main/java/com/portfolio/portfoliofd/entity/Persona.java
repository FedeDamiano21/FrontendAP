package com.portfolio.portfoliofd.entity;



import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter @Setter

@Entity 
public class Persona {
       
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   
    private String nombre;
    private String apellido;
    
    public Persona() {
    }
    
    public Persona(Long id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
}
