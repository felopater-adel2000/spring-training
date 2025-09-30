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
public class Car extends Vehicle {

    private DatabaseOperations databaseOperations;

    @Autowired
    public Car(DatabaseOperations databaseOperations) {
        super();
        this.databaseOperations = databaseOperations;
        setType(Type.Car);
        System.out.println("Car created with constructor injection");
    }

    public void saveVehicle() {
        databaseOperations.saveVehicle(this);
    }
}
