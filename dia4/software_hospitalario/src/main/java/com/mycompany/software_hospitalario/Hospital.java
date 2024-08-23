/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.software_hospitalario;

/**
 *
 * @author camper
 */
class Hospital {
    private String hospital_nombre;
    private String hospital_direccion;
    private int departamentos;


public Hospital (String hospital_nombre, String hospital_direccion, int departamentos)
{
    this.hospital_nombre = hospital_nombre;
    this.hospital_direccion = hospital_direccion;
    this.departamentos = departamentos;
}

 public String getHospital_nombre() {
        return hospital_nombre;
    }
    public void setHospital_nombre(String hospital_nombre) {
        this.hospital_nombre = hospital_nombre;
    }

    public String getHospital_direccion() {
        return hospital_direccion;
    }
    public void setHospital_direccion(String hospital_direccion) {
        this.hospital_direccion = hospital_direccion;
    }

    public int getId_departamento() {
        return departamentos;
    }
    public void setId_departamento(int departamentos) {
        this.departamentos = departamentos;
    }

     @Override
    public String toString(){
        return "Hospital {" +
                "Nombre = " + hospital_nombre + "|" +
                "Direccion = " + hospital_direccion + "|" +
                "Cantidad Departamentos = " + departamentos + "|" +
                "}";
    }
}
