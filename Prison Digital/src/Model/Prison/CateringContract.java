/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Prison;

import Model.Employee.Employee;
import Model.FoodCateringService.FoodCateringService;

/**
 *
 * @author vikasshastry
 */
public class CateringContract {
    
    FoodCateringService foodCateringService;
    Prison prison;
    int prisonerCount;
    String status;
    Employee chef;
    Employee deliveryMan;

    public FoodCateringService getFoodCateringService() {
        return foodCateringService;
    }

    public void setFoodCateringService(FoodCateringService foodCateringService) {
        this.foodCateringService = foodCateringService;
    }

    public Prison getPrison() {
        return prison;
    }

    public void setPrison(Prison prison) {
        this.prison = prison;
    }

    public int getPrisonerCount() {
        return prisonerCount;
    }

    public void setPrisonerCount(int prisonerCount) {
        this.prisonerCount = prisonerCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getChef() {
        return chef;
    }

    public void setChef(Employee chef) {
        this.chef = chef;
    }

    public Employee getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(Employee deliveryMan) {
        this.deliveryMan = deliveryMan;
    }
    
    
}
