package com.session5.task;

import com.session5.task.config.Config;
import com.session5.task.controller.VehicleController;
import com.session5.task.models.Bike;
import com.session5.task.models.Car;
import com.session5.task.models.Plane;
import com.session5.task.models.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Vehicle System Starting ===");

        // Initialize Spring Application Context
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        // Get controller
        VehicleController vehicleController = context.getBean(VehicleController.class);

        // Test creating and saving vehicles
        testVehicleOperations(context, vehicleController);

        // Close context (this will trigger @PreDestroy method)
        ((AnnotationConfigApplicationContext) context).close();

        System.out.println("=== Vehicle System Ended ===");
    }

    private static void testVehicleOperations(ApplicationContext context, VehicleController controller) {
        System.out.println("\n=== Testing Vehicle Operations ===");

        // Create and save a Car (Constructor Injection)
        Car car = context.getBean(Car.class);
        car.setId(UUID.randomUUID().toString());
        car.setBrand("Toyota");
        controller.saveVehicle(car);

        // Create and save a Plane (Setter Injection)
        Plane plane = context.getBean(Plane.class);
        plane.setId(UUID.randomUUID().toString());
        plane.setBrand("Boeing");
        controller.saveVehicle(plane);

        // Create and save a Bike (Field Injection)
        Bike bike = context.getBean(Bike.class);
        bike.setId(UUID.randomUUID().toString());
        bike.setBrand("Honda");
        controller.saveVehicle(bike);

        // Test search by ID
        System.out.println("\n=== Testing Search Operations ===");
        Vehicle foundVehicle = controller.searchById(car.getId());

        // Test get all vehicles
        System.out.println("\n=== Testing Get All Operations ===");
        List<Vehicle> allVehicles = controller.getAllVehicles();
        allVehicles.forEach(System.out::println);

        // Test update
        System.out.println("\n=== Testing Update Operations ===");
        car.setBrand("Updated Toyota");
        controller.updateVehicle(car);

        // Test delete
        System.out.println("\n=== Testing Delete Operations ===");
        controller.deleteVehicle(bike.getId());

        // Show final state
        System.out.println("\n=== Final State ===");
        List<Vehicle> remainingVehicles = controller.getAllVehicles();
        remainingVehicles.forEach(System.out::println);
    }
}
