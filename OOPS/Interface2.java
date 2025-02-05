// Multiple Interface Implementation:
// Create two interfaces, Animal (with a method void eat()) and Bird (with a method void fly()). 
// Implement both interfaces in a class Sparrow.

interface Animal{

    void eat();
}

interface Bird{

    void fly();
}

class Sparrow implements Animal, Bird{

    public void eat(){

        System.out.println("Sparrow eats insect");
    }

    public void fly(){

        System.out.println("Sparrow flies in sky");
    }
}

public class Interface2{

    public static void main(String args[]){

        Sparrow s=new Sparrow();
        s.eat();
        s.fly();
    }
}