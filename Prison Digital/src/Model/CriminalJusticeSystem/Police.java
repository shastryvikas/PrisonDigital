/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.CriminalJusticeSystem;

import Model.Employee.Employee;
import Model.Organization;
import java.util.ArrayList;

/**
 *
 * @author vikasshastry
 */
public class Police extends Organization{
    Employee policeAdmin;
    ArrayList<Employee> listOfPoliceOfficers;
    CaseDirectory caseDirectory;

    public CaseDirectory getCaseDirectory() {
        return caseDirectory;
    }

    public void setCaseDirectory(CaseDirectory caseDirectory) {
        this.caseDirectory = caseDirectory;
    }

    public Employee getPoliceAdmin() {
        return policeAdmin;
    }

    public void setPoliceAdmin(Employee policeAdmin) {
        this.policeAdmin = policeAdmin;
    }

    public ArrayList<Employee> getListOfPoliceOfficers() {
        return listOfPoliceOfficers;
    }

    public void setListOfPoliceOfficers(ArrayList<Employee> listOfPoliceOfficers) {
        this.listOfPoliceOfficers = listOfPoliceOfficers;
    }
}
