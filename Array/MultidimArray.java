public class MultidimArray{

    public static void main(String args[]){

        int [][] age={{20,14,10},{14,17,50}};
        // System.out.println(age[1][2]);

        for(int i=0;i<age.length;i++){
            for(int j=0;j<age[i].length;j++){

                System.out.println(age[i][j]);
            }
        }
    }
}