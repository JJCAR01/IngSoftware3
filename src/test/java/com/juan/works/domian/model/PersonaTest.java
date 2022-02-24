package com.juan.works.domian.model;

import com.juan.works.domain.model.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    @Test
    public void validarCreacionExitosa(){
        // PATRON 3A

        //Arange (Prepara todos los datos para la prueba)
        String nombre = "Juan";
        String apellido = "Cardona";

        //Act (Ejecuta el metodo a probar)
        Persona persona = new Persona(nombre, apellido);

        //Aassert (Se valida el resultado)
        Assertions.assertEquals(persona.getNombre(),"Juan");
        Assertions.assertEquals(persona.getApellido(), "Cardona");
    }

    @Test
    public void validarCamposVaciosONulos(){

        String nombre = "";
        String apellido = "Cardona";

        try {
            new Persona(nombre, apellido);
        } catch (IllegalArgumentException e){
            Assertions.assertEquals(e.getMessage(),"El campo no puede estar vacio o nulo");
        }
    }
}
