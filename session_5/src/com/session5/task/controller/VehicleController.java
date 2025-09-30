package com.session5.task.controller;

import com.session5.task.models.Vehicle;
import com.session5.task.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Component
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    public void saveVehicle(Vehicle vehicle) {
        System.out.println("Controller: Processing save request...");
        vehicleService.saveVehicle(vehicle);
    }

    public void deleteVehicle(String id) {
        System.out.println("Controller: Processing delete request...");
        vehicleService.deleteVehicle(id);
    }

    public void updateVehicle(Vehicle vehicle) {
        System.out.println("Controller: Processing update request...");
        vehicleService.updateVehicle(vehicle);
    }

    public Vehicle searchById(String id) {
        System.out.println("Controller: Processing search request...");
        return vehicleService.searchById(id);
    }

    public List<Vehicle> getAllVehicles() {
        System.out.println("Controller: Processing get all request...");
        return vehicleService.getAllVehicles();
    }
}
