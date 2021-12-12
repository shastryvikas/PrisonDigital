/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Hospital;

import Model.Employee.Employee;
import Model.Employee.EmployeeDirectory;
import Model.Organization;

/**
 *
 * @author vikasshastry
 */
public class PatientCare extends Organization{
    Employee psychologyStaff;
    Employee generalStaff;
    Employee physiotherapyStaff;

    public Employee getPsychologyStaff() {
        return psychologyStaff;
    }

    public void setPsychologyStaff(Employee psychologyStaff) {
        this.psychologyStaff = psychologyStaff;
    }

    public Employee getGeneralStaff() {
        return generalStaff;
    }

    public void setGeneralStaff(Employee generalStaff) {
        this.generalStaff = generalStaff;
    }

    public Employee getPhysiotherapyStaff() {
        return physiotherapyStaff;
    }

    public void setPhysiotherapyStaff(Employee physiotherapyStaff) {
        this.physiotherapyStaff = physiotherapyStaff;
    }
}
