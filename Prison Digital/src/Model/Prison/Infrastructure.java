/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Prison;

import Model.Organization;
import java.util.ArrayList;

/**
 *
 * @author vikasshastry
 */
public class Infrastructure extends Organization{
    ArrayList<Unit> cellsEmpty;
    ArrayList<Unit> cellsOccupied;
    Unit Infirmary; //not used
    Unit Dining;  //not used

    public ArrayList<Unit> getCellsEmpty() {
        if(cellsEmpty == null)
            cellsEmpty = new ArrayList<Unit>();
        return cellsEmpty;
    }

    public void setCellsEmpty(ArrayList<Unit> cellsEmpty) {
        this.cellsEmpty = cellsEmpty;
    }

    public ArrayList<Unit> getCellsOccupied() {
        if(cellsOccupied == null)
            cellsOccupied = new ArrayList<Unit>();
        return cellsOccupied;
    }

    public void setCellsOccupied(ArrayList<Unit> cellsOccupied) {
        this.cellsOccupied = cellsOccupied;
    }
    
    public Unit getInfirmary() {
        return Infirmary;
    }

    public void setInfirmary(Unit Infirmary) {
        this.Infirmary = Infirmary;
    }

    public Unit getDining() {
        return Dining;
    }

    public void setDining(Unit Dining) {
        this.Dining = Dining;
    }
    
}
