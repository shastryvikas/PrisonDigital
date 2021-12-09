/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Prison;

import Model.CriminalJusticeSystem.Case;
import Model.Person;

/**
 *
 * @author vikasshastry
 */
public class Prisoner {
    Person person;
    Case caseRecord;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Case getCaseRecord() {
        return caseRecord;
    }

    public void setCaseRecord(Case caseRecord) {
        this.caseRecord = caseRecord;
    }
}
