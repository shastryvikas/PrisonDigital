/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.PrisonEcosystem;
import Model.UserAccountManagement.UserAccount;
import UI.Prison.PrisonAdminLandingPage;
import javax.swing.JPanel;

/**
 *
 * @author vikasshastry
 */
public class PoliceAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, PrisonEcosystem business) {
        return new PrisonAdminLandingPage(userProcessContainer,account, business);
    }
    
}
