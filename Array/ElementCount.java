import java.util.Scanner;
public class ElementCount{

    public static void main(String args[]){
        

        int [] arr={1,2,3,1,1,3};
        System.out.println("Enter element=");
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==element){
                count++;
            }
        }
        System.out.println(count);

    }
}