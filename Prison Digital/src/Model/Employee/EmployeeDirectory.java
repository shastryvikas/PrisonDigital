/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Employee;

import java.util.ArrayList;

/**
 *
 * @author vikasshastry
 */
public class EmployeeDirectory {
    private ArrayList<Employee> ListOfEmployees;

    public EmployeeDirectory() {
        ListOfEmployees = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return ListOfEmployees;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        ListOfEmployees.add(employee);
        return employee;
    }
    
    
    public void addEmployee(Employee e){
        this.getEmployeeList().add(e);
    }
    
    public void removeEmployee(Employee e){
        ListOfEmployees.remove(e);
    }
    
}
