// Display file information

import java.io.*;

class fileInfo{

    public static void main(String args[]){

        File f=new File("C:\\Users\\ADMIN\\Desktop\\Java-Programs\\File Handling\\Demo.txt");

        if(f.exists()){

            System.out.println("File Name= "+f.getName());
            System.out.println("File Path= "+f.getAbsolutePath());
            System.out.println("Is Readable= "+f.canRead());
            System.out.println("Is Writeable= "+f.canWrite());
            System.out.println("File length= "+f.length());
            // System.out.println("Delete file= "+f.delete());
        }
        else{
            System.out.println("Invalid file");
        }
    }
}