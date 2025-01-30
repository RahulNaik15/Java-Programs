class Animal{

    void sound(){
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal{
    
    @Override
    
    void sound(){
        //super.sound(); if we also want to call the method of base class along with derived class
        System.out.println("Dog Barks");
    }
}

public class Overriding{

    public static void main(String args[]){

        Dog d=new Dog();
        d.sound();
    }
}