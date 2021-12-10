/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Employee;

import Model.Enterprise;
import Model.Person;
import Model.PrisonEcosystem;
import Model.Role.Role;
import Model.UserAccountManagement.UserAccount;

/**
 *
 * @author vikasshastry
 */
public class Employee {
    
    private Person person;
    private int id;
    private UserAccount userAccount;
    private Role role;
    private static int count = 10904;

    public Employee(PrisonEcosystem system, String name, String username, String password, Enterprise enterprise, Role roleType) {
        Person newPerson = new Person(name);
        this.person = newPerson;
        this.userAccount = system.getNewUserAccount(username, password, enterprise, roleType);
        this.role = roleType;
        id = count;
        count++;
    }
    
    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.person.setName(name);
    }

    public String getName() {
        return this.person.getName();
    }

    @Override
    public String toString() {
        return this.person.getName();
    }
    
}