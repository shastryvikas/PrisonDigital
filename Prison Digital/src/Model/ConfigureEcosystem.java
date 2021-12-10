/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Employee.Employee;
import Model.Prison.Management;
import Model.Prison.Prison;
import Model.Role.PrisonAdmin;
import Model.Role.SysAdmin;
import Model.UserAccountManagement.UserAccount;

/**
 *
 * @author vikasshastry
 */
public class ConfigureEcosystem {
    
    public static PrisonEcosystem configure(){
        
        PrisonEcosystem system = new PrisonEcosystem();
        
        Prison p = new Prison();
        Management m = new Management();
        m.setAdmin(new Employee(system, "PrisonAdmin", "prisonadmin", "prisonadmin", p, new PrisonAdmin()));
        p.setManagement(m);
        system.getPrisons().add(p);
        
        system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SysAdmin());
        return system;
        
    }
    
}
