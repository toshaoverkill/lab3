package ru.mirea.aav.lab3;
public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "("+this.x+","+this.y+") speed: ("+xSpeed+","+ySpeed+")";
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
