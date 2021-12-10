/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.CriminalJusticeSystem;

import Model.Employee.Employee;
import Model.Enterprise;
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
}
