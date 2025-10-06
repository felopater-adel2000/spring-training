package com.session5.task.config;

import com.session5.task.controller.VehicleController;
import com.session5.task.dao.DatabaseOperations;
import com.session5.task.models.Bike;
import com.session5.task.models.Car;
import com.session5.task.models.Plane;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.session5.task")
@PropertySource("classpath:application.properties")
public class Config {

    @Value("${database.url}")
    private String databaseUrl;

    @Value("${database.user}")
    private String username;

    @Value("${database.password}")
    private String password;



    @Bean
    @Scope("singleton")
    public DatabaseOperations databaseOperations() {
        return new DatabaseOperations(databaseUrl, username, password);
    }

    @Bean
    @Scope("prototype")
    public Car car() {
        return new Car(databaseOperations());
    }

    @Bean
    @Scope("prototype")
    public Plane plane() {
        Plane plane = new Plane();
        plane.setDatabaseOperations(databaseOperations());
        return plane;
    }

    @Bean
    @Scope("prototype")
    public Bike bike() {
        return new Bike();
    }

}

