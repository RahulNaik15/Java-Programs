import java.util.Scanner;

public class Armstrong{

    public static void main(String args[]){

        System.out.print("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int temp, rem, sum=0;
        temp=num;
        while(num>0){

            rem=num%10;
            sum=(rem*rem*rem)+sum;
            num=num/10;
        }
        if(sum==temp){
            System.out.print("armstrong number");
        }
        else{
            System.out.print("not armstrong number");
        }
    }
}