import java.util.Scanner;

public class SortDesc{

    public static void main(String args[]){

        int [] arr=new int[5];
        System.out.println("Enter array elements=");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]<arr[j]){

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}