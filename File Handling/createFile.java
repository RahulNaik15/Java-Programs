import java.io.*;

class createFile{

    public static void main(String args[]) throws IOException{

     File f=new File("C:\\Users\\ADMIN\\Desktop\\Java-Programs\\File Handling\\Demo.txt");

     if(f.createNewFile()){

        System.out.println("File created successfully");
     }
     else{
        System.out.println("File already exist");
     }
    }
}