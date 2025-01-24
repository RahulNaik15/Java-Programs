import java.util.Scanner;

public class NumMax{

    public static void Maximum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num1=");
        int num1=sc.nextInt();
        System.out.println("Enter Num2=");
        int num2=sc.nextInt();
        System.out.println("Enter Num3=");
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("Number 1 is max");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Number 2 is max");
        }
        else{
            System.out.println("Number 3 is max");
        }
    }

    public static void main(String args[]){
        

        Maximum();

    }
}