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
import Model.Role.Role;
import Model.UserAccountManagement.UserAccount;
import Model.UserAccountManagement.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author vikasshastry
 */
public class PrisonEcosystem {

    private ArrayList<Prison> prisons;
    private ArrayList<FoodCateringService> cateringServices;
    private ArrayList<Hospital> hospitals;
    private ArrayList<CriminalJusticeSystem> criminalJusticeSystems;
    private Employee admin;
    private UserAccountDirectory userAccountDirectory;

    public UserAccountDirectory getUserAccountDirectory() {
        if (userAccountDirectory == null) {
            userAccountDirectory = new UserAccountDirectory();
        }
        return userAccountDirectory;
    }
    
    public UserAccount getNewUserAccount(String username, String password, Enterprise enterprise, Role role){
        return getUserAccountDirectory().addAccount(username, password, enterprise, role);
    }

    public PrisonEcosystem() {
        prisons = new ArrayList<>();
        cateringServices = new ArrayList<>();
        hospitals = new ArrayList<>();
        criminalJusticeSystems = new ArrayList<>();
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public ArrayList<Prison> getPrisons() {
        return prisons;
    }

    public void setPrisons(ArrayList<Prison> prisons) {
        this.prisons = prisons;
    }

    public ArrayList<FoodCateringService> getCateringServices() {
        return cateringServices;
    }

    public void setCateringServices(ArrayList<FoodCateringService> cateringServices) {
        this.cateringServices = cateringServices;
    }

    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public ArrayList<CriminalJusticeSystem> getCriminalJusticeSystems() {
        return criminalJusticeSystems;
    }

    public void setCriminalJusticeSystems(ArrayList<CriminalJusticeSystem> criminalJusticeSystems) {
        this.criminalJusticeSystems = criminalJusticeSystems;
    }

    public Employee getAdmin() {
        return admin;
    }

    public void setAdmin(Employee admin) {
        this.admin = admin;
    }
}
