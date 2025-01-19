import java.util.Scanner;

public class DeleteElement{

    public static void main(String args[]){

        int [] arr=new int[3];
        int [] b=new int[arr.length-1];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements=");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
       System.out.println("Enter location=");
       int loc=sc.nextInt();

        for(int i=0;i<arr.length;i++){

            if(i<loc){
                b[i]=arr[i];
            }
            else if(i==loc)
                continue;
            
            else{
                b[i-1]=arr[i];
            }
        }

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}