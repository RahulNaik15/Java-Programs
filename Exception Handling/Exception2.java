// Multiple catch
// Write a Java program that:
// Initializes a string variable to null and tries to access its length.
// Initializes an array and tries to access an out-of-bound index.
// Handles NullPointerException and ArrayIndexOutOfBoundsException.

class Exception2{

    public static void main(String args[]){

        String str=null;
        int [] arr={1,2,3};
        try{

            System.out.println("String length=" +str.length());

            System.out.println("Array index=" +arr[10]);
        }

        catch(NullPointerException e){
            System.out.println("Null value");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
    }
}