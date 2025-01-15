import java.util.Scanner;

public class Palindrome{
    public static void main(String args[]){
        System.out.println("Enter number=");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        int temp=num;
        int rem, sum=0;
        while(num>0){
          rem=num%10;
          sum=sum*10+rem;
          num=num/10;
         
        }

        if(sum==temp){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not palindrome number");
        }

    }
}