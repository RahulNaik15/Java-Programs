// Extending an Interface:
// Create an interface Person with a method void showDetails(). 
// Create another interface Employee that extends Person and adds a method void getSalary(). 
// Implement both in a class Manager.

interface Person{

    void showDetails();
}

interface Employee extends Person{
// In Java, interfaces cannot use the implements keyword to extend another interface. 
// Instead, interfaces extend other interfaces using the extends keyword.
    void getSalary();
}

class Manager implements Person, Employee{
    
    String name="Rahul";
    String role="Developrer";
    float salary=50000;
    public void showDetails(){

     System.out.println("Employee Name=" +name);
     System.out.println("Role=" +role);

    }

    public void getSalary(){
       System.out.println("Salary=" +salary); 
    }
}

public class Interface4{

    public static void main(String args[]){

        Manager m=new Manager();
        m.showDetails();
        m.getSalary();
    }
}