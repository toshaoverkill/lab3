package ru.mirea.aav.lab3;
public abstract class Shape{
    protected String color;
    protected boolean filled;
    protected double area;
    protected double perimeter;
    public Shape() {
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return toString();
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
