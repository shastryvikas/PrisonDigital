/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Employee.EmployeeDirectory;
import Model.WorkQueue.WorkQueue;

/**
 *
 * @author vikasshastry
 */
public abstract class Enterprise {
    
    String name;
    String location;
    Boolean status;
    WorkQueue workqueue = new WorkQueue();

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
