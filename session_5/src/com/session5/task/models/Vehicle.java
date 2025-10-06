package com.session5.task.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Vehicle {

    private String id;
    private String brand;
    private Type type;

    public Vehicle() {}

    public Vehicle(String id, String brand, Type type) {
        this.id = id;
        this.brand = brand;
        this.type = type;
    }
}
