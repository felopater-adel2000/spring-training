package com.example.di;

public class Car implements Vehicle{

    DatabaseOperation operation;
    public Car(DatabaseOperation operation) {
        this.operation = operation;
    }

    public void insertNewCar() {
        operation.insert("Cart");
    }
}
