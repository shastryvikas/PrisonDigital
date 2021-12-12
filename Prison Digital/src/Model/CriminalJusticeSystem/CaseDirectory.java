/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.CriminalJusticeSystem;

import java.util.ArrayList;

/**
 *
 * @author vikasshastry
 */
public class CaseDirectory {
    private ArrayList<Case> listOfCases;

    public ArrayList<Case> getListOfCases() {
        if(listOfCases == null)
            listOfCases = new ArrayList<Case>();
        return listOfCases;
    }

    public void setListOfCases(ArrayList<Case> listOfCases) {
        this.listOfCases = listOfCases;
    }
    
    public void addCase(Case e){
        listOfCases.add(e);
    }
    
    public void modifyCase(){
        
    }
    
}
