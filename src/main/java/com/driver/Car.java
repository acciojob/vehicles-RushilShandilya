package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name , boolean isManual){
        super(name);
        this.isManual = isManual;
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
    }
    public int getWheels(){return wheels;}
    public String getType(){return type;}
    public int getDoors(){return doors;}
    public int getCurrentGear(){return gears;}
    public boolean isManual(){return isManual;}
    public int getSeats(){return seats;}

    public void setGear(int setGear){
        currentGear = setGear;
    }

    public void changeGear(int newGear){
        setGear(newGear);
        System.out.println("changeGear method called - The gear is changed to: " + getCurrentGear());
    }

    public void changeSpeed(int newSpeed, int newDirection){
        setCurrentSpeed(newSpeed);
        setCurrentDirection(newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + getCurrentSpeed() + ", and the direction is changed to: " + getCurrentDirection() + " degrees");
    }
}
