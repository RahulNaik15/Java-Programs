import java.util.Scanner;
public class Table{

    public static void displayTable(){
     System.out.println("Enter number=");
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();

     for(int i=1;i<=10;i++){

        int n=num*i;
        System.out.println(num+ "x" +i+ "=" +n);
     }

    }

    public static void main(String args[]){

        displayTable();
    }
}