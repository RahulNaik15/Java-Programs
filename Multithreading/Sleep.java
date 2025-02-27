class A extends Thread{

    public void run(){

    String n=Thread.currentThread().getName();
    try{
 
    //  if(n=="Two"){
    //     Thread.sleep(5000);

    //  }  to sleep particular thread for specific time


     for(int i=1;i<=2;i++){
        System.out.println(n);
        Thread.sleep(1000);
    }

    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
    

    }
}

class Sleep{

    public static void main(String args[]){

        A t1=new A();
        A t2=new A();

        t1.setName("One");
        t2.setName("Two");

        t1.start();
        t2.start();
    }
}