import java.util.Scanner;

public class Matrix{

    public static void main(String args[]){

        int [][] arr= new int [2][2];
        int [][] arr2= new int [2][2];

        System.out.println("Enter elements of 1 array=");
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length;j++){

                arr[i][j]=sc.nextInt();
            }

        }

        System.out.println("Enter elements of 2 array=");

        for(int i=0;i<arr2.length;i++){

            for(int j=0;j<arr2.length;j++){

                arr2[i][j]=sc.nextInt();
            }

        }

         System.out.println("First Matrix:");
         for(int i=0;i<2;i++){

                 for(int j=0;j<2;j++){

                     System.out.print(arr[i][j]+" ");
                 }
                 System.out.println();
             }
        System.out.println();

        System.out.println("second Matrix:");
         for(int i=0;i<2;i++){

                 for(int j=0;j<2;j++){

                     System.out.print(arr2[i][j]+" ");
                 }
                 System.out.println();
             }
             System.out.println();

             
        //Multiply matrix
        
        System.out.println("Multiplication Matrix:");

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){

                int mul=arr[i][j]*arr2[i][j];
                System.out.print(mul+" ");
            }
            System.out.println();
        }
         
    }
}