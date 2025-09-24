package com.example.spring_training.shape;

import com.example.spring_training.draw.Draw2d;
import com.example.spring_training.draw.Draw3d;

public class Square implements Shape {

    Draw2d draw2d;
    Draw3d draw3d;

    public void setDraw2d(Draw2d draw2d) {
        this.draw2d = draw2d;
    }

    public void setDraw3d(Draw3d draw3d) {
        this.draw3d = draw3d;
    }

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
