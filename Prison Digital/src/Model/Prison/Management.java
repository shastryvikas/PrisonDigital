/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Prison;

import Model.Employee.Employee;
import Model.Employee.EmployeeDirectory;
import Model.Organization;
import java.util.ArrayList;

/**
 *
 * @author vikasshastry
 */
public class Management extends Organization{
    Employee admin;

    public Employee getAdmin() {
        return admin;
    }

    public void setAdmin(Employee admin) {
        this.admin = admin;
    }
    Employee DiningAdmin;
    Employee InfirmaryAdmin;
    EmployeeDirectory staff;
    ArrayList<Prisoner> prisoners;

    public Employee getDiningAdmin() {
        return DiningAdmin;
    }

    public void setDiningAdmin(Employee DiningAdmin) {
        this.DiningAdmin = DiningAdmin;
    }

    public Employee getInfirmaryAdmin() {
        return InfirmaryAdmin;
    }

    public void setInfirmaryAdmin(Employee InfirmaryAdmin) {
        this.InfirmaryAdmin = InfirmaryAdmin;
    }

    public EmployeeDirectory getStaff() {
        return staff;
    }

    public void setStaff(EmployeeDirectory staff) {
        this.staff = staff;
    }

    public ArrayList<Prisoner> getPrisoners() {
        return prisoners;
    }

    public void setPrisoners(ArrayList<Prisoner> prisoners) {
        this.prisoners = prisoners;
    }
    
}
