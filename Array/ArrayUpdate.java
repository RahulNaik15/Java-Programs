public class ArrayUpdate{

    public static void main(String args[]){

        int [] arr={1,2,3,4,5};

        arr[2]=50;
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}