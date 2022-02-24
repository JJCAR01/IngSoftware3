package com.juan.works.domain.model;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {

        validarCampoVacioONulo(nombre, "El nombre esta vacio");
        validarCampoVacioONulo(apellido, "El apellido esta vacio");

        this.nombre = nombre;
        this.apellido = apellido;
    }

    private void validarCampoVacioONulo(String nombre, String El_nombre_esta_vacio) {
        if(nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException(El_nombre_esta_vacio);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
