/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Prison;

import Model.Location;
import Model.Enterprise;

/**
 *
 * @author vikasshastry
 */
public class Prison extends Enterprise{
    Management management;
    Infrastructure infrastructure;
    String name;

    public Prison(String name, Location location, Boolean status) {
        this.name = name;
        this.setLocation(location);
        this.setStatus(status);
        this.management = new Management();
        this.infrastructure = new Infrastructure();
    }
    
    public Prison() {
        
    }
    
    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Management getManagement() {
        return management;
    }

    public void setManagement(Management management) {
        this.management = management;
    }

    public Infrastructure getInfrastructure() {
        return infrastructure;
    }

    public void setInfrastructure(Infrastructure infrastructure) {
        this.infrastructure = infrastructure;
    }
}
