import java.util.Scanner;

public class PalindromeStr{
    public static void main(String args[]){

        System.out.println("Enter string=");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int i=0;
        int j=str.length()-1;
        int flag=0;

        while(i<j && flag==0){

            if(str.charAt(i)!=str.charAt(j)){
                flag=1;
            }
            i++;
            j--;
        }

        if(flag==1){
            System.out.print("Not a palindrome");
        }
        else{
            System.out.print("palindrome");
        }
    }
}