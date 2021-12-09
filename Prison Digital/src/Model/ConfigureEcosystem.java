/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.UserAccountManagement.UserAccount;

/**
 *
 * @author vikasshastry
 */
public class ConfigureEcosystem {
    
    public static PrisonEcosystem configure(){
        
        PrisonEcosystem system = new PrisonEcosystem();
        UserAccount ua = new UserAccount();
        ua.setUsername("sysadmin");
        ua.setPassword("sysadmin");
        return system;
        
    }
    
}
