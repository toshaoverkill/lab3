package ru.mirea.aav.lab3;
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "("+this.x+","+this.y+") Скорость: ("+xSpeed+","+ySpeed+")";
    }
    @Override
    public void moveUp() {
    }
    @Override
    public void moveDown() {
    }
    @Override
    public void moveLeft() {
    }
    @Override
    public void moveRight() {
    }
}
