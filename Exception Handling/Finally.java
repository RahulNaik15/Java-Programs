// Try-Catch-Finally (Ensuring Code Execution)
// Write a Java program that:
// ArrayIndexoutofbound exception
// Nullpointer exception
// Uses a finally block to print "Execution completed!" whether an exception occurs or not.

class Finally{

    public static void main(String args[])
{
       int arr []={1,2,3};
       String str=null;

       try{

        System.out.println(arr[1]);

        System.out.println(str.length());
       }

       catch(ArrayIndexOutOfBoundsException e){

        System.out.println("Index out of bound");
       }

       catch(NullPointerException e){

        System.out.println("Invalid operation");
       }

       finally{
        System.out.println("program ended");
       }
}
}