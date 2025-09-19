package com.example.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start Project");

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Shape rectangle = container.getBean("rectangle", Rectangle.class);
        Shape circle = container.getBean("circle", Circle.class);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());

        System.out.println("End Project");
    }

}
