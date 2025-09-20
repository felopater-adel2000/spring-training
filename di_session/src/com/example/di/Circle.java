package com.example.di;

public class Circle implements Shape {

    private Draw2d draw2d;
    private Draw3d draw3d;

    public Circle(Draw2d _2d, Draw3d _3d) {
        this.draw2d = _2d;
        this.draw3d = _3d;
    }

    public void draw2d() {
        draw2d.draw("circle");
    }

    public void draw3d() {
        draw3d.draw("circle");
    }

}
