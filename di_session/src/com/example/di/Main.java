package com.example.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start Project");

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Circle circle = container.getBean("circle", Circle.class);
        Square square = container.getBean("square", Square.class);

        circle.draw2d();
        circle.draw3d();

        square.draw2d();
        square.draw3d();

        Car car = container.getBean(Car.class);
        Plane plan = container.getBean(Plane.class);

        car.insertNewCar();
        plan.insertNewPlan();

        System.out.println("End Project");
    }

}
