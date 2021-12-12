/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.FoodCateringService;

import Model.Employee.Employee;
import Model.Hospital.*;
import Model.Prison.*;
import Model.Organization;
import java.util.ArrayList;

/**
 *
 * @author vikasshastry
 */
public class Management extends Organization{
    Employee admin;
    ArrayList<CateringContract> foodOrders;

    public ArrayList<CateringContract> getFoodOrders() {
        if(foodOrders == null)
            foodOrders = new ArrayList<CateringContract>();
        return foodOrders;
    }

    public void setFoodOrders(ArrayList<CateringContract> foodOrders) {
        this.foodOrders = foodOrders;
    }

    public Employee getAdmin() {
        return admin;
    }

    public void setAdmin(Employee admin) {
        this.admin = admin;
    }
    
}
