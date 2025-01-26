// Task:
// Create a class Person with fields name and age.
// Define a default constructor to set default values (name = "Unknown", age = 0).
// Define a parameterized constructor to set custom values.
// Test the constructors by creating objects with both types.


class Person{

    String name; 
    int age;

    Person(){
        name="Unknown";
        age=0;
    }

    Person(String n, int a)
    {
          
         name=n;
         age=a;
    }
}

class Main2{

    public static void main(String args[]){

        Person obj=new Person();
        System.out.println("Name: "+obj.name+" Age: "+obj.age);
        Person obj1=new Person("Rahul", 24);
        System.out.println("Name: "+obj1.name+" Age: "+obj1.age);
        
    }
}