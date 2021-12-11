/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Hospital;

import Model.Enterprise;
import Model.Location;

/**
 *
 * @author vikasshastry
 */
public class Hospital extends Enterprise {

    Management management;
    PatientCare patientCare;
    String name;

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

    public Hospital(String name, Location location, Boolean status) {
        this.name = name;
        this.setLocation(location);
        this.setStatus(status);
        this.management = new Management();
        this.patientCare = new PatientCare();
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
