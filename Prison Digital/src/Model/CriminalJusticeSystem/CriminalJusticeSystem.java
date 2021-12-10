/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.CriminalJusticeSystem;

import Model.Employee.Employee;
import Model.Enterprise;
import Model.Location;
import java.util.ArrayList;

/**
 *
 * @author vikasshastry
 */
public class CriminalJusticeSystem extends Enterprise{
    
    ArrayList<Court> listOfCourts;
    ArrayList<Police> listOfPolice;
    Employee admin;
    String name;

    public CriminalJusticeSystem(String name, Location location, Boolean status) {
        this.name = name;
        this.listOfCourts = new ArrayList<>();
        this.listOfPolice = new ArrayList<>();
        this.setLocation(location);
        this.setStatus(status);
    }

    public ArrayList<Court> getListOfCourts() {
        return listOfCourts;
    }

    public void setListOfCourts(ArrayList<Court> listOfCourts) {
        this.listOfCourts = listOfCourts;
    }

    public ArrayList<Police> getListOfPolice() {
        return listOfPolice;
    }

    public void setListOfPolice(ArrayList<Police> listOfPolice) {
        this.listOfPolice = listOfPolice;
    }

    @Override
    public String toString() {
        return name;
    }

    public Employee getAdmin() {
        return admin;
    }

    public void setAdmin(Employee admin) {
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
