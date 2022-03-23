package com.company;

class Vehicle {
    protected int speed;
    protected int mass;

    public Vehicle(){}

    public Vehicle(int speed, int mass){
        this.speed=speed;
        this.mass=mass;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }

    public void setMass(int mass){
        this.mass=mass;
    }

    public void printVehicleDetails(){
        System.out.println("Speed: "+speed+" Mass: "+mass);
    }
}

class Car extends Vehicle{
    protected int gear;
    protected String make;

    public Car(){}

    public Car(int speed,
               int mass,
               int gear,
               String make){
        super (speed, mass);
        this.gear=gear;
        this.make=make;
    }

    public void setGear(int gear){
        this.gear=gear;
    }

    public void setMake(String make){
        this.make=make;
    };

    public void printCarDetails(){
        System.out.println("Speed: "+speed+" Mass: "+mass + " Gear: "+gear+ " Make: "+make);
    }
}
class Model extends Car{
    protected String model;

    public Model(){}

    public Model(int speed,
                 int mass,
                 int gear,
                 String make,
                 String model){
        super (speed, mass, gear, make);
        this.model=model;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void printModelDetails(){
        System.out.println("Speed: "+speed+" Mass: "+mass + " Gear: "+gear+" Make: "+make+" Model: "+model);
    }

}
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

        System.out.println("Model: ");
        Model modelA = new Model(20, 2000, 3,"Toyota","Corolla");
        modelA.printModelDetails();
        modelA.setModel("camry");
        modelA.printModelDetails();

    }
}
