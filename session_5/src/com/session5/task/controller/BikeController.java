package com.session5.task.controller;

import com.session5.task.models.Bike;
import com.session5.task.service.VehicleService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Getter
@Setter
public class BikeController {

    @Autowired
    private VehicleService vehicleService;

    public void saveVehicle(Bike bike) {
        System.out.println("BikeController: Saving bike...");
        vehicleService.saveVehicle(bike);
    }
}
