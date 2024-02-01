package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        currentSpeed=0;
        currentDirection=0;
    }
    public void setCurrentSpeed(int speed){
        currentSpeed = speed;
    }
    public void setCurrentDirection(int direction){
        currentDirection = direction;
    }
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    public int getCurrentDirection(){
        return currentDirection;
    }
    public String getName(){return name;}

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        int newDirection = getCurrentDirection() + direction;
        setCurrentDirection(newDirection);
        System.out.println("steer method called - The direction is changed to: " + getCurrentDirection() + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        setCurrentSpeed(speed);
        setCurrentDirection(direction);
        System.out.println("move method called - The speed is changed to: " + getCurrentSpeed() + ", and the direction is changed to: " + getCurrentDirection() + " degrees");
    }

    public void stop(){
        setCurrentSpeed(0);
        System.out.println("stop method called - The vehicle is stopped");
    }

}
