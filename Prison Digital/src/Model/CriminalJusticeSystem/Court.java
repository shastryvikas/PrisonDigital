/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.CriminalJusticeSystem;

import Model.Employee.Employee;
import Model.Organization;

/**
 *
 * @author vikasshastry
 */
public class Court extends Organization{
    Employee judge;
    CaseDirectory caseDirectory;

    public Court(Employee judge, String name) {
        this.judge = judge;
        this.setName(name);
    }

    public Employee getJudge() {
        return judge;
    }

    public void setJudge(Employee judge) {
        this.judge = judge;
    }

    public CaseDirectory getCaseDirectory() {
        if(caseDirectory == null)
            caseDirectory = new CaseDirectory();
        return caseDirectory;
    }

    public void setCaseDirectory(CaseDirectory caseDirectory) {
        this.caseDirectory = caseDirectory;
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
}
