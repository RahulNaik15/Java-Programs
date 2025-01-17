import java.util.Scanner;

public class MinValue{

    public static void main(String args[]){
      
      int [] arr=new int[5];
      System.out.println("Enter the array elements=");
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<arr.length;i++){

        arr[i]=sc.nextInt();
      }

      int min=arr[0];

      for(int i=1;i<arr.length;i++){

        if(arr[i]<min){

            min=arr[i];
        }
      }
      System.out.println("Min value="+min);
    }
}