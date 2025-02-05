// Shape Class
// Create an abstract class Shape with an abstract method calculateArea(). 
// Implement this method in two subclasses: Circle and Rectangle.

abstract class Shape{

    abstract void calculateArea();
}

class Circle extends Shape{
    

    float pi=3.14f;
    int r;
    void calculateArea(){
        
        r=2;
        float area=2*pi*r;
        System.out.println("Area of circle=" +area);
    }
}

class Rectangle extends Shape{

    int l,b;
    void calculateArea(){
    
     l=5;
     b=5;
     int area=l*b;
     System.out.println("Area of rectangle=" +area); 

    }
}

public class Abstract2{

    public static void main(String args[]){

        Circle c=new Circle();
        c.calculateArea();
        Rectangle r=new Rectangle();
        r.calculateArea();
    }
}