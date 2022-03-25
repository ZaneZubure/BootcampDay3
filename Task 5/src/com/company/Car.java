package com.company;

public class Car extends Vehicle {
    protected int gear;
    protected String make;

    public Car() {}

    public Car(int speed,
               int mass,
               int gear,
               String make) {
        super(speed, mass);
        this.gear = gear;
        this.make = make;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void printCarDetails() {
        System.out.println("Speed: " + speed + " Mass: " + mass + " Gear: " + gear + " Make: " + make);
    }
}
