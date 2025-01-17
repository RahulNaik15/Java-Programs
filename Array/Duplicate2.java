import java.util.HashSet;

public class Duplicate2{

    public static void main(String args[]){

        int [] arr={5,4,3,2,1};

        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<arr.length;i++){

            hs.add(arr[i]);
        }

        for(int e:hs){
            System.out.print(e);
        }
    }
}