public class Overloading{


// when one or more method has same name but different parameters it is called method overloading.
// In method overloading the return type can be different

    void add(){

        int a=5,b=5;
        int c=a+b;
        System.out.println(c);
    }

    void add(int x, int y){

        int c=x+y;
        System.out.println(c);
    }

    void add(int x, float y){

        float c=x+y;
        System.out.println(c);
    }

    public static void main(String args[]){

        Overloading obj=new Overloading();
        obj.add();
        obj.add(10,10);
        obj.add(50,50.0f);
    }
}