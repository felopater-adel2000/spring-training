package com.example.spring_training;

import com.example.spring_training.database.DatabaseOperation;
import com.example.spring_training.shape.Circle;
import com.example.spring_training.shape.Square;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Project");

        try(ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            Circle c = container.getBean("prototypeCircle", Circle.class);
            Square s = container.getBean(Square.class);

            c.draw();
            s.draw();

            DatabaseOperation operation =  container.getBean("databaseOperation", DatabaseOperation.class);
        } catch (Exception e) {

        }


        System.out.println("End Project");
    }
}
