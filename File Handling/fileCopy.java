import java.io.*;

public class fileCopy{

    public static void main(String args[]) throws IOException{

        FileInputStream f=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Java-Programs\\File Handling\\Demo.txt");
        //FileInputStream => used to read the file
        FileOutputStream w=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Java-Programs\\File Handling\\NewFile.txt");
        //FileInputStream => used to create and write the file

        int i;
        while((i=f.read())!=-1){

            w.write((char)i);
            
        }
        System.out.println("Filed Copied");
    }
}