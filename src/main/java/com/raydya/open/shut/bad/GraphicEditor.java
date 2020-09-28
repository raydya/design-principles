package com.raydya.open.shut.bad;

public class GraphicEditor {

    public void draw(Shape shape) {
        final int type = shape.type;
        if (type == 1) {
            drawRectangle((Rectangle) shape);
        } else if (type == 2) {
            drawCircle((Circle) shape);
        }
    }

    public void drawCircle(Circle circle) {
        // draw circle
    }

    public void drawRectangle(Rectangle rectangle) {
        // draw rectangle
    }
}
