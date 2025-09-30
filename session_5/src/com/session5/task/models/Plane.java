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
public class Plane extends Vehicle {

    private DatabaseOperations databaseOperations;

    public Plane() {
        super();
        setType(Type.Plane);
        System.out.println("Plane created");
    }

    @Autowired
    public void setDatabaseOperations(DatabaseOperations databaseOperations) {
        this.databaseOperations = databaseOperations;
        System.out.println("Plane configured with setter injection");
    }

    public void saveVehicle() {
        databaseOperations.saveVehicle(this);
    }
}
