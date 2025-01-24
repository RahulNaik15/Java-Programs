import java.util.Scanner;

public class ReverseStr{

    public static void stringReverse(){
        System.out.println("Enter String=");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        String reverse="";

        for(int i=str.length()-1;i>=0;i--){

            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static void main(String args[]){
        stringReverse();
    }
}