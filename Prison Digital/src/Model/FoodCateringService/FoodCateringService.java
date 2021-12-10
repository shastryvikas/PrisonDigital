/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.FoodCateringService;

import Model.Enterprise;
import Model.Location;

/**
 *
 * @author vikasshastry
 */
public class FoodCateringService extends Enterprise {

    Kitchen kitchen;
    Management management;
    Transport transport;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FoodCateringService(String name, Location location, Boolean status) {
        this.name = name;
        this.setLocation(location);
        this.setStatus(status);
        this.management = new Management();
        this.transport = new Transport();
        this.kitchen = new Kitchen();
    }

    @Override
    public String toString() {
        return name;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public Management getManagement() {
        return management;
    }

    public void setManagement(Management management) {
        this.management = management;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
