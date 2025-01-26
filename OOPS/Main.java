// Task: Create a class Car with fields brand and color.
// Use a constructor to initialize these fields and display their values using a method.


class Car{

    String brand, color;

    Car(){

        brand="BMW";
        color="Black";
    }

     void showData(){
        System.out.println("Car: "+brand+ " Color: "+color);
    }
}

class Main{

    public static void main(String args[]){
        
        
        Car obj=new Car();
        showData();
       
    }
}