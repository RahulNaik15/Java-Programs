class A extends Thread{

// In this we cannot handle exception using throws because run is overidden from Thread class so we have to handle it using try-catch

    public void run(){

    try{
       for(int i=1;i<=5;i++){
            System.out.println("Java");
            Thread.sleep(1000); //delay of 1 sec sleep is method of Thread class
        }
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
        
    }
}

class extendingThread{

    public static void main(String args[]) throws InterruptedException{

        A t=new A();
        t.start();

       for(int i=0;i<=5;i++){
            System.out.println("Program");
            Thread.sleep(1000);
        } 
    }

}