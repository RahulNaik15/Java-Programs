import java.util.Scanner;

public class RowSum{

    public static void main(String args[]){

        int [][] arr={{1,2,3},{4,5,6}};

        for(int i=0;i<2;i++){

            int sum=0;

            for(int j=0;j<3;j++){

                sum+=arr[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row:" +sum);
        }
        
    }
}