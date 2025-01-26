// Task: Create a class Rectangle with fields length and width.
// Create one constructor that accepts no arguments (sets length and width to 1).
// Create another constructor that accepts one argument (sets a square with length and width equal).
// Create a third constructor that accepts two arguments (sets custom length and width).
// Write a method to calculate the area of the rectangle and display it.

class Rectangle{

    float length;
    float width;

    Rectangle(){
        length=1.0f;
        width=1.0f;
    }

    Rectangle(float square){
     length=square;
     width=square;
    }

    Rectangle(float l, float w){
        length=l;
        width=w;
    }

    void Area(){
        float area=length*width;
        System.out.println("Area of rectangle=" +area);
    }
}

class ConstructorOverloading{

    public static void main(String args[]){

        Rectangle obj=new Rectangle();
        obj.Area();
        Rectangle obj2=new Rectangle(6.0f);
        obj2.Area();
        Rectangle obj3=new Rectangle(5.0f,5.0f);
        obj3.Area();
        
    }
}