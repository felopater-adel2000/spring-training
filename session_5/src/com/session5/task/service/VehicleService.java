package com.session5.task.service;

import com.session5.task.dao.DatabaseOperations;
import com.session5.task.models.Vehicle;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
public class VehicleService {

    @Autowired
    private DatabaseOperations databaseOperations;

    public void saveVehicle(Vehicle vehicle) {
        System.out.println("Service: Saving vehicle...");
        databaseOperations.saveVehicle(vehicle);
    }

    public void deleteVehicle(String id) {
        System.out.println("Service: Deleting vehicle with ID: " + id);
        databaseOperations.deleteVehicle(id);
    }

    public void updateVehicle(Vehicle vehicle) {
        System.out.println("Service: Updating vehicle...");
        databaseOperations.updateVehicle(vehicle);
    }

    public Vehicle searchById(String id) {
        System.out.println("Service: Searching vehicle with ID: " + id);
        return databaseOperations.searchById(id);
    }

    public List<Vehicle> getAllVehicles() {
        System.out.println("Service: Retrieving all vehicles...");
        return databaseOperations.getAllVehicles();
    }
}
