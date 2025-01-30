// Create two classes:
// Animal with a method sound() that prints "Animals make sounds."
// Dog that extends Animal and overrides the sound() method to print "Dogs bark."
// Write a program to create objects of both classes and call the sound() method on them.

class Animal{

    void sound(){
        System.out.println("Animals make sounds.");
    }
}

class Dog extends Animal{
     
     void sound(){
        System.out.println("Dogs bark.");
     }
}

public class Inheritance{

    public static void main(String args[]){

        Dog obj=new Dog();
        Animal obj2=new Animal();
        obj2.sound();
        obj.sound();
    }
}