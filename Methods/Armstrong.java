import java.util.Scanner;

public class Armstrong{

    public static void checkArmstrong(){

        System.out.print("Enter number=");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int temp, rem, sum=0;
        temp=num;

        while(num>0){

            rem=num%10;
            sum=(rem*rem*rem)+sum;
            num=num/10;
        }

      if(temp==sum){
        System.out.print("Armstrong");
      }
      else{
        System.out.print(" Not Armstrong");
      }
    }

    public static void main(String args[]){

      checkArmstrong();
        
    }
}