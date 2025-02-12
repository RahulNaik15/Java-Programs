// Multiple Try-Catch Blocks
// Try block 1: handle numberformat exception
// Try block 2: Take two numbers from the user and perform division. Handle ArithmeticException.

class Multitrycatch{

    public static void main(String args[]){

    String str="abc";
int num1=10,num2=0,d;

    try{

        System.out.println(Integer.parseInt(str));
    }
     catch(NumberFormatException e){

        System.out.println("Invalid operation");
     }

     try{
        d=num1/num2;
        System.out.println(d);
     }
      catch(ArithmeticException e){

        System.out.println("cannot divide");
     }

    }
}