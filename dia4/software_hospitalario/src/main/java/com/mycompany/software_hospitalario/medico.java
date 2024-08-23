/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.software_hospitalario;

/**
 *
 * @author camper
 */
public class medico extends persona {
    private String especializacion;
    private String tipo;
    
    public medico ( String especializacion, String tipo, int id, String nombre, String direccion, String nombre_hospital) {
        super (id, nombre, direccion, nombre_hospital);
        
        this.especializacion = especializacion;
        this.tipo = tipo;
    }
    
    
      @Override
    public int getId() {
        return super.getId(); 
    }
    @Override
    public void setId(int id) {
        super.setId(id); 
    }

    @Override
    public String getNombre() {
        return super.getNombre(); 
    }
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); 
    }

    @Override
    public String getDireccion() {
        return super.getDireccion(); 
    }
    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion); 
    }

    @Override
    public String getNombre_hospital() {
        return super.getNombre_hospital();
    }
    @Override
    public void setNombre_hospital(String nombre_hospital) {
        super.setNombre_hospital(nombre_hospital); 
    }

    public String getEspecializacion() {
        return especializacion;
    }
    public void setEspecializacion(String especializacion) {
        this.especializacion= especializacion;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return "Medico {" +
                "ID = " + getId() + "|" +
                "Nombre = " + getNombre() + "|" +
                "Direccion = " + getDireccion() + "|" +
                "Hospital = " + getNombre_hospital() + "|" +
                "Especializacion = " + especializacion + "|" +
                "Tipo = " + tipo + "|" +
                "}";
    }
    
}
            
