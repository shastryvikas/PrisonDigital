/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Role.SysAdmin;
import Model.UserAccountManagement.UserAccount;

/**
 *
 * @author vikasshastry
 */
public class ConfigureEcosystem {
    
    public static PrisonEcosystem configure(){
        
        PrisonEcosystem system = new PrisonEcosystem();
        system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SysAdmin());
        return system;
        
    }
    
}
