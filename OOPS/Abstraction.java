/* Abstarct class is a class that start with astract keyword.
Abstract method is a method that does not contain body (no implementation) /abstract mehtod should start with abstract keyword.
If a class has abstract method then the class should also be abstract but an abstract class can have regular methods.
A class which inherit abstract class should define the body of all abstract methods in it.
We cannot create the object of abstract class because there is no implementation or body of abstract mehtod.*/


abstract class Vehicle{

    int tyres;
    abstract void start();
}

class Car extends Vehicle{
   
   int tyres=2;
   void start(){
    System.out.println("No of tyres=" +tyres);
    System.out.println("Car start with key");
   }
}

class Scooter extends Vehicle{

    int tyres=4;
    void start(){
    System.out.println("No of tyres=" +tyres);
    System.out.println("Scooter start with kick");
   }
}

public class Abstraction{

    public static void main(String args[]){

        Car c=new Car();
        c.start();
        Scooter s=new Scooter();
        s.start();

    }
}