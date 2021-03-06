/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.UserAccountManagement;

import Model.Enterprise;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vikasshastry
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public void deleteUserAccount(UserAccount user){
        userAccountList.remove(user);
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public void updateUserAccount(UserAccount user,String username, String password){
        user.setUsername(username);
        user.setPassword(password);
    }
    
    public UserAccount createUserAccount(String username, String password, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount addAccount(String username, String password, Enterprise enterprise, Role role){
        UserAccount userAccount = new UserAccount(username, password, enterprise, role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}

