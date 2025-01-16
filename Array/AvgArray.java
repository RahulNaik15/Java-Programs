public class AvgArray{

    public static void main(String args[]){

        int [] marks={80,70,60,75,90};
        int total=marks.length;

        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }

        int average=sum/total;
        System.out.println("Average="+average);
    }
}