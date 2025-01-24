public class EvenOdd{
    

    //when method is declared static we dont not required to create an object
    public static void checkNum(){

        //here void is used i.e does not return any value so return is not used
        int num=2;
        if(num%2==0){
           System.out.println("Even Number"); 
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String args[]){

        checkNum();
    }

}