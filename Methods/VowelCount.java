import java.util.Scanner;

public class VowelCount{

    public static void vowelsCount(){
        System.out.println("Enter string=");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        str=str.toLowerCase();
        
        int count=0;
        for(int i=0;i<str.length();i++)
        if(str.charAt(i)== 'a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
            count++;
        }
        System.out.println("Number of vowels in string =" +count);
    }

    public static void main(String args[]){
        vowelsCount();
        

    }
}