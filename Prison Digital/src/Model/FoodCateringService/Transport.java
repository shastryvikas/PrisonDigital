/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.FoodCateringService;

import Model.Employee.EmployeeDirectory;
import Model.Organization;

/**
 *
 * @author vikasshastry
 */
public class Transport extends Organization {

    EmployeeDirectory staff;

    public Transport() {
        this.staff = new EmployeeDirectory();
    }

    public EmployeeDirectory getStaff() {
        return staff;
    }

    public void setStaff(EmployeeDirectory staff) {
        this.staff = staff;
    }
}
