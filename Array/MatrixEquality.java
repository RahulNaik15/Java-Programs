import java.util.Scanner;

public class MatrixEquality{

    public static void main(String args[]){

        int [][] arr1=new int[2][2];
        int [][] arr2=new int[2][2];
        
        System.out.println("Enter array 1 elements:");
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr1.length;i++){

            for(int j=0;j<arr1.length;j++){

                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter array 2 elements:");

        for(int i=0;i<arr2.length;i++){

            for(int j=0;j<arr2.length;j++){

                arr2[i][j]=sc.nextInt();
            }
        }
       
       System.out.println("1 Array:");

       for(int i=0;i<arr1.length;i++){

        for(int j=0;j<arr1.length;j++){

            System.out.print(arr1[i][j]+" ");
        }
        System.out.println();
       }

       System.out.println();
       
       System.out.println("2 Array:");
       for(int i=0;i<arr2.length;i++){

        for(int j=0;j<arr2.length;j++){

            System.out.print(arr2[i][j]+" ");
        }
        System.out.println();
       }

       System.out.println();

       boolean isEqual=true;
       for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
        if(arr1[i][j]!=arr2[i][j]){
         isEqual=false;
         break;
       }
        }
        if(!isEqual){
            break;
        }
      }

      if(isEqual){
        System.out.print("Equal Matrix");
      }
      else{
        System.out.print("Unequal Matrix");
      }
       

    }
}