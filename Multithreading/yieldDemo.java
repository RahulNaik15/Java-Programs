class A extends Thread{

    
    public void run(){
       for(int i=1;i<=2;i++){
        System.out.println("hello");
        Thread.yield();
       }
    }
}

class B extends Thread{
   
    
    public void run(){
        for(int i=1;i<=2;i++){
            System.out.println("hi");
        }
    }
}

public class yieldDemo{

    public static void main(String args[]){

        A t1=new A();
        B t2=new B();

        t1.start();
        t2.start();
    }
}