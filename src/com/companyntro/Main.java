package com.companyntro;

public class Main {

    public static void main(String[] args) {
        // 6th Task:
        // Create a class called Vehicle. Let this car have features like,
        // length of the vehicle, the number of seats,
        // no of tires, name/brand of the vehicle, current speed.
        //
        // methods include: speed up(increases speed by 5), slow down (reduce speed by 5), start engine, stop engine.

        Vehicle car1 = new Vehicle();

    car1.lengthVehical = 4;
    car1.numberOfSeats = 5;
    car1.numberOfTires = 4;
    car1.brandOfVehicle = "Lexus";

    car1.speedUp();
    car1.startEngine();
        car1.speedUp();
        car1.speedUp();
        System.out.println(car1.currentSpeed);
        car1.slowDown();
        car1.slowDown();
        car1.slowDown();
        System.out.println(car1.currentSpeed);
    car1.stopEngine();

    }
}
