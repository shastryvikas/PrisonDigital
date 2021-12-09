/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.CriminalJusticeSystem.CriminalJusticeSystem;
import Model.Employee.Employee;
import Model.FoodCateringService.FoodCateringService;
import Model.Hospital.Hospital;
import Model.Prison.Prison;

/**
 *
 * @author vikasshastry
 */
public class PrisonEcosystem{
    
    Prison[] prisons;
    FoodCateringService[] cateringServices;
    Hospital[] hospitals;
    CriminalJusticeSystem[] criminalJusticeSystems;
    Employee admin;

    public Prison[] getPrisons() {
        return prisons;
    }

    public void setPrisons(Prison[] prisons) {
        this.prisons = prisons;
    }

    public FoodCateringService[] getCateringServices() {
        return cateringServices;
    }

    public void setCateringServices(FoodCateringService[] cateringServices) {
        this.cateringServices = cateringServices;
    }

    public Hospital[] getHospitals() {
        return hospitals;
    }

    public void setHospitals(Hospital[] hospitals) {
        this.hospitals = hospitals;
    }

    public CriminalJusticeSystem[] getCriminalJusticeSystems() {
        return criminalJusticeSystems;
    }

    public void setCriminalJusticeSystems(CriminalJusticeSystem[] criminalJusticeSystems) {
        this.criminalJusticeSystems = criminalJusticeSystems;
    }
       
}
