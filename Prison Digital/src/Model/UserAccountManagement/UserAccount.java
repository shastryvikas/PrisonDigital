/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.UserAccountManagement;

import Model.Enterprise;
import Model.WorkQueue.WorkQueue;

/**
 *
 * @author vikasshastry
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Enterprise enterprise;
    WorkQueue workQueue;

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
}
