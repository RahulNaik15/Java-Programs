import java.util.*;

public class checkPrime{
    public static void main(String args[]){

    int count=0;
    System.out.println("Enter the num=");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();

    for(int i=1;i<=num;i++){

        if(num%i==0){
            count++;
        }
    }
    if(count==2){
        System.out.println("Prime number");
    }
    else{
        System.out.println("not Prime number");
    }
    

    }
}