/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agregacion;

/**
 *
 * @author win10
 */
public class Agregacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department dept = new Department ("Engineering");
        Employee emp1 = new Employee ("mozo");
        Employee emp2 = new Employee ("daza");
        
        dept.addEmploye(emp2);
        dept.addEmploye(emp1);
        
        for (int i = 0; i<= dept.getEmployes().size();i++){
            System.out.println("");
        }
    }
    }
    

