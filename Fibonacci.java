import java.util.Scanner;

public class Fibonacci{

    public static void main(String args[]){

        System.out.print("Enter the n term=");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0, b=1;
        System.out.print(+a+ " " +b);

        for(int i=1;i<=num;i++){

            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}