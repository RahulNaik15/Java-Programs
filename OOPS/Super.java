// Using super Keyword
// Create a class Person with attributes name and age, and a method display() to show them.
// Create a class Student that extends Person and adds studentId. 
// Override display() in Student to show all attributes (name, age, and studentId). 
// Use the super keyword in Student's display() method.

class Person{

    String name="Rahul";
    int age=24;

    void Display(){

        System.out.println("Name=" +name);
        System.out.println("Age=" +age);
    }
}

class Student extends Person{
    
    int studentId=101;
    void Display(){
    
    System.out.println("Student ID=" +studentId);
    super.Display();

    }
}

public class Super{

    public static void main(String args[]){

        Student s=new Student();
        s.Display();
    }
}