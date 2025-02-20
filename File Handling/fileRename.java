import java.io.*;

class fileRename{

    public static void main(String args[]){

        File f=new File("C:\\Users\\ADMIN\\Desktop\\Java-Programs\\File Handling\\oldfile.txt"); // open file to be renamed
        File r=new File("C:\\Users\\ADMIN\\Desktop\\Java-Programs\\File Handling\\NewFile.txt"); // new file object and name

        if(f.exists()){

            System.out.println(f.renameTo(r));
            System.out.println("Filed Renamed Successfully");
        }
        else{
           System.out.println("Invalid file"); 
        }
    }
}