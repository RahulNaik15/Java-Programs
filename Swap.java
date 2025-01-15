
import java.util.Scanner;
public class Swap{
    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first num=");
    int num1=sc.nextInt();
    System.out.print("Enter second num=");
    int num2=sc.nextInt();
    int temp;
    System.out.println("Numbers before swapping=" +num1+ " "+num2);
    
    temp=num1;
    num1=num2;
    num2=temp;

    System.out.println("Numbers after swapping=" +num1+ " "+num2);
    
    
    }
}