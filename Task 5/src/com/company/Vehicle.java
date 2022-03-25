package com.company;

public class Vehicle {
    protected int speed;
    protected int mass;

    public Vehicle() {
    }

    public Vehicle(int speed, int mass) {
        this.speed = speed;
        this.mass = mass;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void accelerate (int speed) {this.speed+=speed;}

    public void printVehicleDetails() {
        System.out.println("Speed: " + speed + " Mass: " + mass);
    }
}
