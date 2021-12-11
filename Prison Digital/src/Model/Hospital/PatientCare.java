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
    Employee psychologist;
    Employee generalPhysician;
    Employee patientCareTechnician;

    public Employee getPsychologist() {
        return psychologist;
    }

    public void setPsychologist(Employee psychologist) {
        this.psychologist = psychologist;
    }

    public Employee getGeneralPhysician() {
        return generalPhysician;
    }

    public void setGeneralPhysician(Employee generalPhysician) {
        this.generalPhysician = generalPhysician;
    }

    public Employee getPatientCareTechnician() {
        return patientCareTechnician;
    }

    public void setPatientCareTechnician(Employee patientCareTechnician) {
        this.patientCareTechnician = patientCareTechnician;
    }

    

    
}
