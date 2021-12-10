/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.UserAccountManagement;

import Model.Enterprise;
import Model.Role.Role;
import Model.WorkQueue.WorkQueue;

/**
 *
 * @author vikasshastry
 */
public class UserAccount {

    public UserAccount(String username, String password, Enterprise enterprise, Role role) {
        this.username = username;
        this.password = password;
        this.enterprise = enterprise;
        this.role = role;
    }

    public UserAccount() {
    }
    
    private String username;
    private String password;
    private Enterprise enterprise;
    private WorkQueue workQueue;
    private WorkQueue oldWorkQueue;
    private Role role;

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public WorkQueue getOldWorkQueue() {
        return oldWorkQueue;
    }

    public void setOldWorkQueue(WorkQueue oldWorkQueue) {
        this.oldWorkQueue = oldWorkQueue;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

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
