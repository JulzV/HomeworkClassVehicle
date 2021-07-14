package com.companyntro;

public class Vehicle {

    double lengthVehical;
    int numberOfSeats;
    int numberOfTires;
    String brandOfVehicle;
    double currentSpeed = 0;
    boolean engineOn = false;

// Method 1. Start engine.
    void startEngine (){
        System.out.println("The car starts up and goes br-r-r-r-r.");
        this.engineOn = true;
    }

// Method 2. Stop engine.
    void stopEngine (){
        System.out.println("The care engine is off.");
        this.engineOn = false;
    }

    //  Method 3. Speed up (+5 km/h).

    void speedUp (){
        if (this.engineOn == true) {
           this.currentSpeed = this.currentSpeed + 5;
        } else {
            System.out.println("Please start the engine on to speed up!");
        }
    }

    void slowDown (){
        if (this.engineOn == true){
            this.currentSpeed = this.currentSpeed - 5;
            if (currentSpeed < 0) {
                currentSpeed = 0;
                System.out.println("Your current speed is 0 km/h");
            }
        }else{
            System.out.println("Please start the engine on to speed up!");
        }

    }

}
