package com.session5.task.models;

import com.session5.task.dao.DatabaseOperations;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString(callSuper = true)
public class Bike extends Vehicle {

    @Autowired
    private DatabaseOperations databaseOperations;

    public Bike() {
        super();
        setType(Type.Bike);
        System.out.println("Bike created with field injection");
    }

    public void saveVehicle() {
        databaseOperations.saveVehicle(this);
    }
}