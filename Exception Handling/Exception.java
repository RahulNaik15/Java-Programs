// Basic Try-Catch (Handling ArithmeticException)
// Write a Java program that:
// Takes two integers as input.
// Performs division (num1 / num2).
// Catches the ArithmeticException if the denominator is zero and prints an appropriate message.

class Exception{

    public static void main(String args[]){

        try {

            int num1=10, num2=0,c;
            c=num1/num2;
            System.out.println(c);

        }

        catch(ArithmeticException e){

            System.out.println("Cannot divide by zero");
        }
    }
}
