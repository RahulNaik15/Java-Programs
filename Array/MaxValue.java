import java.util.Scanner;

public class MaxValue{

    public static void main(String args[]){

        int [] arr=new int[5];
        System.out.println("Enter array elements=");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i]>max){

                max=arr[i];
            }
        }
        System.out.println("Max value="+max);
    }
}