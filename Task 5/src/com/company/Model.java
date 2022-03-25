package com.company;

public class Model extends Car {
    protected String model;

    public Model() {
    }

    public Model(int speed,
                 int mass,
                 int gear,
                 String make,
                 String model) {
        super(speed, mass, gear, make);
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void printModelDetails() {
        System.out.println("Speed: " + speed + " Mass: " + mass + " Gear: " + gear + " Make: " + make + " Model: " + model);
    }

}
