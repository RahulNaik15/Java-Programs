import java.util.*;

public class Result{
    public static void main(String args[]){
       
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter s1 marks=");
        int s1=sc.nextInt();
        System.out.print("Enter s2 marks=");
        int s2=sc.nextInt();
        System.out.print("Enter s3 marks=");
        int s3=sc.nextInt();

        int total=s1+s2+s3;
        float max=300f;
        float percentage= (total/max)*100;
        
        if(percentage>=40 && s1>=33 && s2>=33 && s3>=33){
            System.out.println("You are pass");
        }
        else{
            System.out.println("fail");
        }


    }
}
