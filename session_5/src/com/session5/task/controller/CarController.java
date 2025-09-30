package com.session5.task.controller;

import com.session5.task.models.Car;
import com.session5.task.service.VehicleService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Getter
@Setter
public class CarController {

    @Autowired
    private VehicleService vehicleService;

    public void saveVehicle(Car car) {
        System.out.println("CarController: Saving car...");
        vehicleService.saveVehicle(car);
    }
}
