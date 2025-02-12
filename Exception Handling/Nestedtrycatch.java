// Nested Try-Catch (Handling Different Exceptions in Different Scenarios)
// Write a Java program that:
// Uses an outer try block to access an array of 5 elements.
// Uses an inner try block to convert a string to an integer using Integer.parseInt().
// Catches and handles:
// NumberFormatException (if input is not a valid number).
// ArrayIndexOutOfBoundsException (if the index is out of range).

class Nestedtrycatch{

    public static void main(String args[]){

        try{

            

            try{
                String str="abc";

                System.out.println(Integer.parseInt(str));
            }

            catch(NumberFormatException e){
              
              System.out.println("Cannot convert string to number");

            }
           
           int [] arr={1,2,3}; 
           System.out.println(arr[1]);
            
        }

        catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Index out of bound");
        }
    }
}