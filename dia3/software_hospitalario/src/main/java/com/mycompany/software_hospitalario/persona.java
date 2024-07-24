/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.software_hospitalario;

/**
 *
 * @author camper
 */
//class persona

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class persona{
    private String nombre;
    private String direccion;
    private  Date fechanacimiento;
    private List <Hospital> hospitales;
    
    public persona (String nombre,String direccion,Date fechanacimiento){
            this.nombre= nombre;
            this.direccion=direccion;
            this.fechanacimiento = fechanacimiento;
            this.hospitales= new ArrayList<> ();
    }
    public String getNmobre() {
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
    
    public Date getfechanacimiento (){
            return fechanacimiento;
    }
    
    public void setfechanacimiento(Date fechanacimiento){
             this.fechanacimiento = fechanacimiento;
}
