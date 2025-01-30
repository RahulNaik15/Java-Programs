// Create the following classes:
// Vehicle with a method run() that prints "Vehicle is running."
// Car that extends Vehicle and overrides run() to print "Car is running."
// SportsCar that extends Car and overrides run() to print "SportsCar is running fast."
// Write a program to call the run() method using an object of the SportsCar class.

class Vehicle{

    void run1(){

        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle{

    void run2(){
        System.out.println("Car is running");
    }
}

class Sportscar extends Car{
    void run3(){
        System.out.println("Sportscar is running");
    }
}

public class Multilevel{

    public static void main(String args[]){
        Sportscar s=new Sportscar();
        s.run3();
        s.run2();
    }
}