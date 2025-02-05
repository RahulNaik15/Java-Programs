/* Interface is used to achieve abstraction 
Interface is similar to abstract class but all the methods in interface are abstract method i.e cannot have body.
All methods in interface are public+abstract 
By interface we can achieve multiple inheritance
variables in interface are public static final
*/

// Create an interface Vehicle with a method void start(). 
// Implement this interface in Car and Bike classes with different implementations of start().

interface Vehicle{

    void start();
}

class Bike implements Vehicle{

    public void start(){

        System.out.println("Bike start by kick");
    }
}

class Car implements Vehicle{

    public void start(){

        System.out.println("Car start by Keys");
    }
}

public class Interface{

    public static void main(String args[]){

        Bike b=new Bike();
        b.start();
        Car c=new Car();
        c.start();
    }
}