import java.util.Scanner;

public class marks{
    public static void main(String args[]){
    
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Subject1 marks=");
   int m1=sc.nextInt();
   System.out.println("Enter Subject2 marks=");
   int m2=sc.nextInt();
   System.out.println("Enter Subject3 marks=");
   int m3=sc.nextInt();
   System.out.println("Enter Subject4 marks=");
   int m4=sc.nextInt();
   System.out.println("Enter Subject5 marks=");
   int m5=sc.nextInt();

   float percentage=((m1+m2+m3+m4+m5)/500f)*100;
   System.out.print("Total Percentage="+percentage);


    }
}