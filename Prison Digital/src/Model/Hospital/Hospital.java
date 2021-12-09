/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Hospital;

import Model.Enterprise;

/**
 *
 * @author vikasshastry
 */
public class Hospital extends Enterprise{
    Management management;
    PatientCare patientCare;

    public Management getManagement() {
        return management;
    }

    public void setManagement(Management management) {
        this.management = management;
    }

    public PatientCare getPatientCare() {
        return patientCare;
    }

    public void setPatientCare(PatientCare patientCare) {
        this.patientCare = patientCare;
    }
}
