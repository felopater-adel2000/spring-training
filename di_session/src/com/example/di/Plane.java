package com.example.di;

public class Plane implements Vehicle{

    public void setOperation(DatabaseOperation operation) {
        this.operation = operation;
    }

    DatabaseOperation operation;

    public void insertNewPlan() {
        operation.insert("Plan");
    }

}
