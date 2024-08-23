/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregacion;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author win10
 */
public class Department {
    private String name;
    private List<Employee> employees;

    public Department() {
    }
    
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>(); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    
}
