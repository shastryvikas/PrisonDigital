/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.PrisonEcosystem;
import Model.UserAccountManagement.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author vikasshastry
 */
public abstract class Role {
    
    public enum RoleType{
        
        CriminalJusticeSystemAdmin("CriminalJusticeSystemAdmin"),
        FoodCateringServiceAdmin("FoodCateringServiceAdmin"),
        HospitalAdmin("HospitalAdmin"),
        PrisonAdmin("PrisonAdmin"),
        Judge("Judge"),
        PoliceAdmin("PoliceAdmin"),
        Police("Police"),
        DiningAdmin("DiningAdmin"),
        InfirmaryAdmin("InfirmaryAdmin"),
        PrisonStaff("PrisonStaff"),
        Doctor("Doctor"),
        SysAdmin("SystemAdmin"),
        Chef("Chef"),
        DeliveryMan("DeliveryMan");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount  account,  
            PrisonEcosystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
