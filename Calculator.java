import java.util.*;

public class Calculator{
    public static void main(String args[]){
    System.out.println("Enter the operation=");
    Scanner sc=new Scanner(System.in);
    char op=sc.next().charAt(0);
    System.out.println("Enter the num1=");
    int num1=sc.nextInt();
    System.out.println("Enter the num2=");
    int num2=sc.nextInt();

    if(op=='+'){
        System.out.println("Result="+ (num1+num2));
    }
    else if(op=='-'){
     System.out.println("Result="+ (num1-num2));
     }
    else if(op=='*'){
        System.out.println("Result="+ (num1*num2));
    }
    else if(op=='/'){
        System.out.println("Result="+ (num1/num2));
    }
    else{
        System.out.println("Invalid");
    }
    }
}