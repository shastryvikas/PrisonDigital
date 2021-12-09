/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Hospital;

import Model.Employee.EmployeeDirectory;
import Model.Organization;

/**
 *
 * @author vikasshastry
 */
public class PatientCare extends Organization{
    EmployeeDirectory psychologyStaff;
    EmployeeDirectory generalStaff;
    EmployeeDirectory physiotherapyStaff;

    public EmployeeDirectory getPsychologyStaff() {
        return psychologyStaff;
    }

    public void setPsychologyStaff(EmployeeDirectory psychologyStaff) {
        this.psychologyStaff = psychologyStaff;
    }

    public EmployeeDirectory getGeneralStaff() {
        return generalStaff;
    }

    public void setGeneralStaff(EmployeeDirectory generalStaff) {
        this.generalStaff = generalStaff;
    }

    public EmployeeDirectory getPhysiotherapyStaff() {
        return physiotherapyStaff;
    }

    public void setPhysiotherapyStaff(EmployeeDirectory physiotherapyStaff) {
        this.physiotherapyStaff = physiotherapyStaff;
    }
}
