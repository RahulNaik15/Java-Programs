class A extends Thread{

    public void run(){

     String n=Thread.currentThread().getName(); // In n variable we will store current thread in thread class there is currentThread() which give current thread and getName() get name of current thread we have set.
     for(int i=1;i<=3;i++){
        System.out.println(n);
     }
    }
}

class threadScheduler{

    public static void main(String args[]){

        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}