import java.util.*;

public class Leap{

    public static void main(String args[]){
        
        System.out.print("Enter year=");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();

        if((year %400==0) || (year%4==0 && year%100!=0)){
            System.out.print("Leap year");
        }
        else{
            System.out.print(" Not a Leap year");
        }
    }
}