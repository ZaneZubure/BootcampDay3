package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Vehicle: ");
        Vehicle vehicleA = new Vehicle(200, 1500);
        vehicleA.printVehicleDetails();
        vehicleA.setSpeed(150);
        vehicleA.printVehicleDetails();

        System.out.println("Car: ");
        Car carA = new Car(20, 2000, 3, "Toyota");
        carA.printCarDetails();
        carA.setGear(4);
        carA.setMass(1500);
        carA.setSpeed(50);
        carA.setMake("Audi");
        carA.printCarDetails();
        carA.accelerate(20);
        carA.printCarDetails();

        System.out.println("Model: ");
        Model modelA = new Model(20, 2000, 3,"Toyota","Corolla");
        modelA.printModelDetails();
        modelA.setModel("Camry");
        modelA.printModelDetails();
        modelA.accelerate(-5);
        modelA.setMass(1500);
        modelA.changeGear(-1);
        modelA.printModelDetails();



    }
}
