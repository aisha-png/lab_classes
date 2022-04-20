package org.example.classes;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle (float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return this.length;
    }

    public double getArea() {
        return (this.width * this.length);
    }
    public double getPerimeter() {
        return(2 * this.length + 2 * this.width);
    }

    public double getDiagonal(){
        return (Math.sqrt(Math.pow(length,2) + (Math.pow(width, 2))));
    }

    public float getWidth() {
        return this.width;
    }


}
