package com.juan.works.infrastructure.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorPersona {

    @GetMapping("/personas")
    public String listar() {
        return "Hola";
    }

    @PostMapping("/personas")
    public void crear(){
        
    }
}
