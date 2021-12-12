/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Prison;

import Model.Hospital.Hospital;

/**
 *
 * @author vikasshastry
 */
public class HospitalContract {
    
    Hospital hospital;
    Prison prison;
    int patientCareTech;
    int psychologists;
    int generalDocs;
    String status;
    Boolean patientCareTechApproval = false;
    Boolean psychologistsApproval = false;
    Boolean generalDocsApproval = false;

    public Boolean getPatientCareTechApproval() {
        return patientCareTechApproval;
    }

    public void setPatientCareTechApproval(Boolean patientCareTechApproval) {
        this.patientCareTechApproval = patientCareTechApproval;
    }

    public Boolean getPsychologistsApproval() {
        return psychologistsApproval;
    }

    public void setPsychologistsApproval(Boolean psychologistsApproval) {
        this.psychologistsApproval = psychologistsApproval;
    }

    public Boolean getGeneralDocsApproval() {
        return generalDocsApproval;
    }

    public void setGeneralDocsApproval(Boolean generalDocsApproval) {
        this.generalDocsApproval = generalDocsApproval;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Prison getPrison() {
        return prison;
    }

    public void setPrison(Prison prison) {
        this.prison = prison;
    }

    public int getPatientCareTech() {
        return patientCareTech;
    }

    public void setPatientCareTech(int patientCareTech) {
        this.patientCareTech = patientCareTech;
    }

    public int getPsychologists() {
        return psychologists;
    }

    public void setPsychologists(int psychologists) {
        this.psychologists = psychologists;
    }

    public int getGeneralDocs() {
        return generalDocs;
    }

    public void setGeneralDocs(int generalDocs) {
        this.generalDocs = generalDocs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return this.getPrison().getName();
    }
    
}
