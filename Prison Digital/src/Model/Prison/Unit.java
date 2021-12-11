/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Prison;

/**
 *
 * @author vikasshastry
 */
public class Unit {
    
//    protected enum UnitType{
//        Cell("Cell"),
//        Infirmary("Infirmary"),
//        Dining("Dining");
//        
//        private String value;
//        
//        private UnitType(String value){
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        @Override
//        public String toString() {
//            return value;
//        }
//    }
    
    //private UnitType unitType;
    private int capacity;
    private int unitID;
    private int currentOccupancy;
    private static int count = 2689;

//    public Unit(UnitType unitType, int capacity, int currentOccupancy) {
//        this.unitType = unitType;
//        this.capacity = capacity;
//        this.currentOccupancy = currentOccupancy;
//        int unitID = count++;
//    }

    public Unit() {
        this.capacity = 1;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getUnitID() {
        return unitID;
    }

    public void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    public int getCurrentOccupancy() {
        return currentOccupancy;
    }

    public void setCurrentOccupancy(int currentOccupancy) {
        this.currentOccupancy = currentOccupancy;
    }

//    public UnitType getUnitType() {
//        return unitType;
//    }
//
//    public void setUnitType(UnitType unitType) {
//        this.unitType = unitType;
//    }
    
}
