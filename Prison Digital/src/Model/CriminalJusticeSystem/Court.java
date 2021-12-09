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

    public Employee getJudge() {
        return judge;
    }

    public void setJudge(Employee judge) {
        this.judge = judge;
    }

    public CaseDirectory getCaseDirectory() {
        return caseDirectory;
    }

    public void setCaseDirectory(CaseDirectory caseDirectory) {
        this.caseDirectory = caseDirectory;
    }
}
