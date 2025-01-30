// Overriding in Multilevel Inheritance:
// Create three classes A, B, and C where C overrides a method from B, and B overrides the same method from A.

class A{

    void show(){
        System.out.println("I am class A");
    }
}

class B extends A{
    
    @Override
    void show(){
        System.out.println("I am class B");
    }
}

class C extends B{
    
    @Override
    void show(){
        System.out.println("I am class C");
    }

}

public class Overriding3{

    public static void main(String args[]){

        C c=new C();
        B b=new B();
        c.show();
        b.show();
    }
}