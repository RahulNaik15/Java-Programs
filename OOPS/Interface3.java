// Interface as a Reference Variable:
// Create an interface Shape with a method void draw(). 
// Implement it in two classes, Circle and Rectangle. 
// In the main() method, create a reference of Shape and use it to call draw() for both objects.

interface Shape{

    void Draw();
}

class Circle implements Shape{

    public void Draw(){
        System.out.println("Draw Circle");
    }
}

class Rectangle implements Shape{

    public void Draw(){
        System.out.println("Draw Rectangle");
    }
}

public class Interface3{

    public static void main(String args[]){
        Shape s=new Circle();
        Shape sh=new Rectangle();
        s.Draw();
        sh.Draw();
    }
}