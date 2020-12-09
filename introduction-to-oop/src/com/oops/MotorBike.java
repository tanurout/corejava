package com.oops;

public class MotorBike {
   private int speed;//member variable are specific to objects

    void setSpeed(int speed){ //local variable
      this.speed = speed;
        //System.out.println(speed);
   }
    void start(){
        System.out.println("Bike started");
        //System.out.println("speed of ducati" + ducati.speed);
        //System.out.println("speed of honda  " + honda.speed);

    }
}
