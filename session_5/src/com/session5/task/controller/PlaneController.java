package com.session5.task.controller;


import com.session5.task.models.Plane;
import com.session5.task.service.VehicleService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Getter
@Setter
public class PlaneController {

    @Autowired
    private VehicleService vehicleService;

    public void saveVehicle(Plane plane) {
        System.out.println("PlaneController: Saving plane...");
        vehicleService.saveVehicle(plane);
    }
}
