class A extends Thread{

    public void run(){
      System.out.println("java programming");
    }
}

public class isAliveDemo{

    public static void main(String args[]){

        A t1=new A();
        A t2=new A();
        A t3=new A();

        System.out.println(t1.isAlive()); //false because thread is not started yet 
        t1.start();
        System.out.println(t1.isAlive()); // true because thread is started

        t2.start();
        t3.start();

        t2.stop();
        System.out.println(t2.isAlive());

    }
}