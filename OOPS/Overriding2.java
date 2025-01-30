// Overriding with Different Return Types:
// Create a parent class Shape with a method getArea() returning a double. 
// Override this method in a Circle class to calculate the area of a circle.

class Shape{

    double getArea(){

       return 0.0;
    }
}

class Circle extends Shape{
    
    @Override
    double getArea(){
        super.getArea();
        double pi=3.14;
        int r=5;
        double area=2*pi*r;
        
        return area;
    }
}

public class Overriding2{

    public static void main(String args[]){

        Circle c=new Circle();
        Shape c1=new Shape();
        double arr=c.getArea();
        double arr1=c1.getArea();
        System.out.println("Area of circle=" +arr1);
        System.out.println("Area of circle=" +arr);
        
        
    }
}