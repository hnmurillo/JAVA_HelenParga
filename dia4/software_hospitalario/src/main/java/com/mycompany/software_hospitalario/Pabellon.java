/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.software_hospitalario;

/**
 *
 * @author camper
 */
public class Pabellon {
    private String nombre_pabellon;
    private String especializacion_pabellon;
    private int numero_pacientes;
    private String hospital_pabellon;
    
    public Pabellon (String nombre_pabellon, String especializacion_pabellon, int numero_pacientes, String hospital_pabellon){
        this.nombre_pabellon = nombre_pabellon;
        this.especializacion_pabellon = especializacion_pabellon;
        this.numero_pacientes = numero_pacientes;
        this.hospital_pabellon = hospital_pabellon;
    }
      
    
   public String getNombre_Pabellom(){
       return nombre_pabellon;
       
   }
   
   public void setNombre_Pabellon(String nombre_pabellon) {
        this.nombre_pabellon = nombre_pabellon;
    }

    public String getEspecializacion_pabellon() {
        return especializacion_pabellon;
    }
    public void setEspecialidad_pabellon(String especializacion_pabellon) {
        this.especializacion_pabellon = especializacion_pabellon;
    }

    public int getNumero_pacientes() {
        return numero_pacientes;
    }
    public void setNumero_pacientes(int numero_pacientes) {
        this.numero_pacientes = numero_pacientes;
    }

    public String getHospital_pabellon() {
        return hospital_pabellon;
    }
    public void setHospital_pabellon(String hospital_pabellon) {
        this.hospital_pabellon = hospital_pabellon;
    }
    
    @Override
    public String toString(){
        return "Pabellon {" +
                "Nombre = " + nombre_pabellon + "|" +
                "Especialidad = " + especializacion_pabellon + "|" +
                "Numero Pacientes = " + numero_pacientes + "|" +
                "Hospital = " + hospital_pabellon + "|" +
                "}";
    }
}
            
