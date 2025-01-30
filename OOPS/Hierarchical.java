// Create a class Shape with a method area() that prints "Area of shape."
// Then create two classes Circle and Rectangle that extend Shape.
// Override area() in Circle to calculate the area of a circle.
// Override area() in Rectangle to calculate the area of a rectangle.
// Write a program to test these methods using objects of Circle and Rectangle.

class Shape{

    void area(){
        System.out.println("Area of shape:");
    }
}

class Circle extends Shape{

  void area(){
    int r=5;
    float pi=3.14f;
    float area=2*pi*r;
    System.out.println("Area of circle=" +area);
  }
    
}

class Rectangle extends Shape{

    void area(){
        int l=5,b=10;
        int area=l*b;
        System.out.println("Area of rectangle=" +area);
    }
}

public class Hierarchical{

    public static void main(String args[]){

        Circle c=new Circle();
        c.area();
        Rectangle r=new Rectangle();
        r.area();
    }
}