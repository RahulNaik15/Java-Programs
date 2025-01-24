public class ColSum{

    public static void main(String args[]){

        int [][] arr={{1,2},{1,2}};

        for(int j=0;j<2;j++){
            int sum=0;

            for(int i=0;i<2;i++){

                sum+=arr[i][j];
            }
            System.out.println("Sum of "+(j+1)+" column:" +sum);
        }
    }
}