class A implements Runnable{

    public void run(){

        for(int i=1;i<=5;i++){

            System.out.println("Java Programming");
        }
    }
}

class implementRunnable{

    public static void main(String args[]){

        A a=new A();
        Thread t=new Thread(a);
        t.start();

        // for(int i=1;i<=5;i++){

        //     System.out.println("Java");
        // }

    }
}