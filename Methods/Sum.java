public class Sum{

    public int SumNum(int n1, int n2){
       
       return n1+n2;

       //return is used when we return any value here int is declared so it return integer value

    }

    public static void main(String args[]){

        Sum obj=new Sum();
        int result=obj.SumNum(5,15);
        System.out.println("Sum=" +result);
    }
}