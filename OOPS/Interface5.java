// Interface and Abstract Class Together:
// Create an abstract class Appliance with an abstract method void turnOn().
// Also, create an interface Electronic with a method void charge(). Implement both in a class Laptop.

abstract class Appliance{

    abstract void turnOn();
}

interface Electronic{

  void charge();

}

// Laptop extends Appliance (abstract class) and implements Electronic (interface)
class Laptop extends Appliance implements Electronic{

    void turnOn(){

        System.out.println("Turn on the laptopn");
    }

    public void charge(){

        System.out.println("Charge the laptopn");
    }
}

public class Interface5{

    public static void main(String args[]){

        Laptop l=new Laptop();
        l.turnOn();
        l.charge();
    }
}