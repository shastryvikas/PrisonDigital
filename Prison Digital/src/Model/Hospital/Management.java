/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Hospital;

import Model.Employee.Employee;
import Model.Prison.*;
import Model.Organization;

/**
 *
 * @author vikasshastry
 */
public class Management extends Organization{
    Employee hospitalAdmin;

    public Employee getHospitalAdmin() {
        return hospitalAdmin;
    }

    public void setHospitalAdmin(Employee hospitalAdmin) {
        this.hospitalAdmin = hospitalAdmin;
    }
}
