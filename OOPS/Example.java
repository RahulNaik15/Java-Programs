// Create a class Employee with a constructor that accepts name and salary and prints them.
// Create a class Manager that extends Employee and adds an additional attribute department. 
// Use the super keyword to call the parent class constructor. 
// Write a program to test this by creating an object of Manager.

class Employee{
    
    String name;
    float salary;
    Employee( String name, float salary){

        this.name=name;
        this.salary=salary;
     }

    void Display1(){
      System.out.println("Name=" +name);
      System.out.println("Salary=" +salary);
    }
        
}

class Manager extends Employee{
    
    String department;
    Manager(String name, float salary, String department){
        super(name,salary);
        this.department=department;
}
        void Display2(){
         System.out.println("Department=" +department);
        }
        
    
}
public class Example{

    public static void main(String args[]){
        
        
        Manager m=new Manager("Rahul",50000,"Development");
        m.Display1();
        m.Display2();
    }
}