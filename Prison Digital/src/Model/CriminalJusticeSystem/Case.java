/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.CriminalJusticeSystem;

import Model.Employee.Employee;
import Model.Person;
import Model.Prison.Prison;
import Model.Prison.Unit;
import Model.WorkQueue.WorkRequest;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author vikasshastry
 */
public class Case extends WorkRequest {

    private String verdict;
    private Person accused;
    private Boolean isImprisoned;
    private Date startDate;
    private int yearsOfImprisonment;
    private int caseNumber;
    private Court processingCourt;
    private Police processingPoliceDepartment;
    private Employee transportedToPrisonBy;
    private Prison prison;
    private Unit cell;
    WorkRequest policeworkRequest;

    public WorkRequest getPoliceworkRequest() {
        return policeworkRequest;
    }

    public void setPoliceworkRequest(WorkRequest policeworkRequest) {
        this.policeworkRequest = policeworkRequest;
    }
    private static int count = 2361;

    private String status = "New Case";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Unit getCell() {
        return cell;
    }

    public void setCell(Unit cell) {
        this.cell = cell;
    }

    public Case(String verdict, Person accused, Boolean isImprisoned, Date startDate, int yearsOfImprisonment, Court processingCourt) {
        this.verdict = verdict;
        this.accused = accused;
        this.isImprisoned = isImprisoned;
        this.startDate = startDate;
        this.yearsOfImprisonment = yearsOfImprisonment;
        this.caseNumber = ThreadLocalRandom.current().nextInt(00000, 99999 + 1);
        this.processingCourt = processingCourt;
    }

    public String getVerdict() {
        return verdict;
    }

    public void setVerdict(String verdict) {
        this.verdict = verdict;
    }

    public Person getAccused() {
        return accused;
    }

    public void setAccused(Person accused) {
        this.accused = accused;
    }

    public Boolean isImprisoned() {
        return isImprisoned;
    }

    public void setImprisoned(Boolean isImprisoned) {
        this.isImprisoned = isImprisoned;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getYearsOfImprisonment() {
        return yearsOfImprisonment;
    }

    public void setYearsOfImprisonment(int yearsOfImprisonment) {
        this.yearsOfImprisonment = yearsOfImprisonment;
    }

    public int getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(int caseNumber) {
        this.caseNumber = caseNumber;
    }

    public Court getProcessingCourt() {
        return processingCourt;
    }

    public void setProcessingCourt(Court processingCourt) {
        this.processingCourt = processingCourt;
    }

    public Police getProcessingPoliceDepartment() {
        return processingPoliceDepartment;
    }

    public void setProcessingPoliceDepartment(Police processingPoliceDepartment) {
        this.processingPoliceDepartment = processingPoliceDepartment;
    }

    public Employee getTransportedToPrisonBy() {
        return transportedToPrisonBy;
    }

    public void setTransportedToPrisonBy(Employee transportedToPrisonBy) {
        this.transportedToPrisonBy = transportedToPrisonBy;
    }

    public Prison getPrison() {
        return prison;
    }

    public void setPrison(Prison prison) {
        this.prison = prison;
    }

    @Override
    public String toString() {
        return this.caseNumber + "";
    }

}
