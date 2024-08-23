/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.software_hospitalario;

/**
 *
 * @author camper
 */
//class persona


public class persona{
    int id;
    String nombre;
    String direccion;
    String nombre_hospital;
    
    public persona (int id, String nombre, String direccion, String nombre_hospital) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nombre_hospital = nombre_hospital;
    }
    
      public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
            this.nombre=nombre;
            
    }
    
     public String getDireccion() {
            return direccion;
    }
     
    public void setDireccion(String direccion) {
            this.direccion= direccion;
    }
       public String getNombre_hospital() {
        return nombre_hospital;
    }
    public void setNombre_hospital(String nombre_hospital) {
        this.nombre_hospital = nombre_hospital;
    }
  
}
    
   