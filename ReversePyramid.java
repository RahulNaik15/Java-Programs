public class ReversePyramid{
    public static void main(String args[]){
        int n=5;
        int i,j,k;
        for(i=1;i<=n;i++){

            for(j=5;j>=i;j--){
                System.out.print("*");
            }
            for(k=1;k<=n-j;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}