import java.io.*;

class fileWrite{

    public static void main(String args[]){
       
       try{
        FileWriter f=new FileWriter("C:\\Users\\ADMIN\\Desktop\\Java-Programs\\File Handling\\Demo.txt");
      
        try{
         
            f.write("Java Programming Language");
        }
        finally{
            f.close();
        }
 }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Operation done successfully");
    }
}

//Other ways of writing in files are
//BufferedWriter = it provides newLine() method to print on new line

//PrintWriter
// PrintWriter writer = new PrintWriter("output.txt"); // Creating a PrintWriter object
// writer.println("Hello, World!"); // Writing a line to the file